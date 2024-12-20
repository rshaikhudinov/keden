//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.simpledataobjects_v0_4;

import java.math.BigDecimal;
import keden.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber24MeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Числовая величина, определенная в результате измерения физических параметров в каких-либо единицах измерения
 * 
 * <p>Java class for DimensionalMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionalMeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;MeasureType"&gt;
 *       &lt;attribute name="measurementUnitCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}MeasurementUnitCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionalMeasureType", propOrder = {
    "value"
})
@XmlSeeAlso({
    FractionNumber24MeasureType.class,
    FractionNumber10MeasureType.class,
    PhysicalMeasureType.class,
    FractionNumber9MeasureType.class
})
public class DimensionalMeasureType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "measurementUnitCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String measurementUnitCode;

    /**
     * Числовая величина, определенная в результате измерения объекта
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the measurementUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnitCode() {
        return measurementUnitCode;
    }

    /**
     * Sets the value of the measurementUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnitCode(String value) {
        this.measurementUnitCode = value;
    }

}
