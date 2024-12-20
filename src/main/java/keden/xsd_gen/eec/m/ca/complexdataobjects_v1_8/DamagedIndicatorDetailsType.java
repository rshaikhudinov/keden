//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о признаках повреждений
 * 
 * <p>Java class for DamagedIndicatorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DamagedIndicatorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DamagedCargoAreaIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DamagedSealIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DamagedIndicatorDetailsType", propOrder = {
    "damagedCargoAreaIndicator",
    "damagedSealIndicator"
})
public class DamagedIndicatorDetailsType {

    @XmlElement(name = "DamagedCargoAreaIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean damagedCargoAreaIndicator;
    @XmlElement(name = "DamagedSealIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean damagedSealIndicator;

    /**
     * Gets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public boolean isDamagedCargoAreaIndicator() {
        return damagedCargoAreaIndicator;
    }

    /**
     * Sets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public void setDamagedCargoAreaIndicator(boolean value) {
        this.damagedCargoAreaIndicator = value;
    }

    /**
     * Gets the value of the damagedSealIndicator property.
     * 
     */
    public boolean isDamagedSealIndicator() {
        return damagedSealIndicator;
    }

    /**
     * Sets the value of the damagedSealIndicator property.
     * 
     */
    public void setDamagedSealIndicator(boolean value) {
        this.damagedSealIndicator = value;
    }

}
