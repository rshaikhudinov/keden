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
 * Компоненты, представляющие сведения об обеззараживании
 * 
 * <p>Java class for GoodsDisinfectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsDisinfectionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DisinfectionIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DisinfectionDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsDisinfectionDetailsType", propOrder = {
    "disinfectionIndicator",
    "disinfectionDetails"
})
public class GoodsDisinfectionDetailsType {

    @XmlElement(name = "DisinfectionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean disinfectionIndicator;
    @XmlElement(name = "DisinfectionDetails")
    protected DisinfectionDetailsType disinfectionDetails;

    /**
     * Gets the value of the disinfectionIndicator property.
     * 
     */
    public boolean isDisinfectionIndicator() {
        return disinfectionIndicator;
    }

    /**
     * Sets the value of the disinfectionIndicator property.
     * 
     */
    public void setDisinfectionIndicator(boolean value) {
        this.disinfectionIndicator = value;
    }

    /**
     * Описание проведенного обеззараживания
     * 
     * @return
     *     possible object is
     *     {@link DisinfectionDetailsType }
     *     
     */
    public DisinfectionDetailsType getDisinfectionDetails() {
        return disinfectionDetails;
    }

    /**
     * Sets the value of the disinfectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisinfectionDetailsType }
     *     
     */
    public void setDisinfectionDetails(DisinfectionDetailsType value) {
        this.disinfectionDetails = value;
    }

}