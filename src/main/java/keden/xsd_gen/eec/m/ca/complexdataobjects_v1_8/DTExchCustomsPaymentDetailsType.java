//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о расчете таможенного платежа
 * 
 * <p>Java class for DTExchCustomsPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTExchCustomsPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ListItemOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentBaseDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTExchCustomsPaymentDetailsType", propOrder = {
    "listItemOrdinal",
    "customsPaymentBaseDetails"
})
public class DTExchCustomsPaymentDetailsType {

    @XmlElement(name = "ListItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger listItemOrdinal;
    @XmlElement(name = "CustomsPaymentBaseDetails", required = true)
    protected CustomsPaymentBaseDetailsType customsPaymentBaseDetails;

    /**
     * Порядковый номер записи
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListItemOrdinal() {
        return listItemOrdinal;
    }

    /**
     * Sets the value of the listItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListItemOrdinal(BigInteger value) {
        this.listItemOrdinal = value;
    }

    /**
     * Gets the value of the customsPaymentBaseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsPaymentBaseDetailsType }
     *     
     */
    public CustomsPaymentBaseDetailsType getCustomsPaymentBaseDetails() {
        return customsPaymentBaseDetails;
    }

    /**
     * Sets the value of the customsPaymentBaseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsPaymentBaseDetailsType }
     *     
     */
    public void setCustomsPaymentBaseDetails(CustomsPaymentBaseDetailsType value) {
        this.customsPaymentBaseDetails = value;
    }

}
