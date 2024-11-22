package keden.core;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final String ERROR_KEY = "error";
    private static final String FIELD_KEY = "field";
    private static final String MESSAGE_KEY = "message";
    private static final String MESSAGE_FULL = "message_full";

    @ExceptionHandler({MethodArgumentNotValidException.class, HttpMessageNotReadableException.class})
    public ResponseEntity<Map<String, String>> handleExceptions(Exception ex) {
        Map<String, String> errors = new HashMap<>();

        if (ex instanceof MethodArgumentNotValidException validationException) {
            for (FieldError error : validationException.getBindingResult().getFieldErrors()) {
                errors.put(error.getField(), error.getDefaultMessage());
            }
        } else if (ex instanceof HttpMessageNotReadableException) {
            Throwable cause = ex.getCause();
            switch (cause) {
                case InvalidFormatException formatException -> {
                    errors.put(ERROR_KEY, "Invalid format");
                    errors.put(FIELD_KEY, formatException.getPath().getFirst().getFieldName());
                    errors.put(MESSAGE_KEY, "Expected type: " + formatException.getTargetType().getSimpleName());
                    errors.put(MESSAGE_FULL, formatException.getMessage());
                }
                case UnrecognizedPropertyException unrecognizedPropertyException -> {
                    errors.put(ERROR_KEY, "Unknown property");
                    errors.put(FIELD_KEY, unrecognizedPropertyException.getPropertyName());
                    errors.put(MESSAGE_KEY, "Property is not supported");
                    errors.put(MESSAGE_FULL, unrecognizedPropertyException.getMessage());
                }
                case MismatchedInputException mismatchException -> {
                    String fieldName = mismatchException.getPath().isEmpty() ? "unknown" : mismatchException.getPath().getFirst().getFieldName();
                    String expectedType = mismatchException.getTargetType().getSimpleName();
                    if (expectedType.equals("List") || expectedType.equals("Array")) {
                        errors.put(ERROR_KEY, "Invalid JSON format");
                        errors.put(FIELD_KEY, fieldName);
                        errors.put(MESSAGE_KEY, "Expected array, but received a single value for '" + fieldName + "'");
                        errors.put(MESSAGE_FULL, mismatchException.getMessage());
                    } else {
                        errors.put(ERROR_KEY, "Invalid JSON format");
                        errors.put(FIELD_KEY, fieldName);
                        errors.put(MESSAGE_KEY, "Expected single value, but received an array for '" + fieldName + "'");
                        errors.put(MESSAGE_FULL, mismatchException.getMessage());
                    }
                }
                case null, default -> errors.put(ERROR_KEY, "Invalid JSON");
            }
        } else {
            errors.put(ERROR_KEY, "Bad request");
        }
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<Map<String, String>> handleMissingServletRequestParameterException(MissingServletRequestParameterException ex) {
        Map<String, String> errorResponse = new HashMap<>();
        errorResponse.put(ERROR_KEY, "Missing request parameter");
        errorResponse.put(FIELD_KEY, ex.getParameterName());
        errorResponse.put(MESSAGE_KEY, "Parameter '" + ex.getParameterName() + "' is required but was not provided");
        errorResponse.put(MESSAGE_FULL, ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}

