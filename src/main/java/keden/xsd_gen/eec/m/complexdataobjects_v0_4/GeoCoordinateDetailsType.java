//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие информацию о географическом положении объекта
 * 
 * <p>Java class for GeoCoordinateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeoCoordinateDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LongitudeMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LatitudeMeasure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeoCoordinateDetailsType", propOrder = {
    "longitudeMeasure",
    "latitudeMeasure"
})
public class GeoCoordinateDetailsType {

    @XmlElement(name = "LongitudeMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected BigDecimal longitudeMeasure;
    @XmlElement(name = "LatitudeMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected BigDecimal latitudeMeasure;

    /**
     * Gets the value of the longitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitudeMeasure() {
        return longitudeMeasure;
    }

    /**
     * Sets the value of the longitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitudeMeasure(BigDecimal value) {
        this.longitudeMeasure = value;
    }

    /**
     * Gets the value of the latitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitudeMeasure() {
        return latitudeMeasure;
    }

    /**
     * Sets the value of the latitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitudeMeasure(BigDecimal value) {
        this.latitudeMeasure = value;
    }

}