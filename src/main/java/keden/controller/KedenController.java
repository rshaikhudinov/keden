package keden.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import keden.dto.Test;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
@RequiredArgsConstructor
@Tag(name = "Методы")
@RequestMapping("/website")
public class KedenController {

@GetMapping("/getTest")
    @Operation(summary = "Получение",
            description = "Метод для получения",
            tags = {"Методы"},
            responses = {
                    @ApiResponse(responseCode = "200", description = "Успешное получение данных", content = @Content(schema = @Schema(implementation = String.class))),
                    @ApiResponse(responseCode = "500", description = "Ошибка", content = @Content(mediaType = "application/json", examples = @ExampleObject(value = "{\"message\": \"Текст ошибки\"}")))
            })
    public ResponseEntity<String> getTest(@RequestParam @Parameter(description = "Текст") String text) {
        return ResponseEntity.ok(text);
    }
}
