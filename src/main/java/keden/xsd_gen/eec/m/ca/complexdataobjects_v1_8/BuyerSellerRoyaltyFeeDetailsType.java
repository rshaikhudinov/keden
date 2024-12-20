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
 * сведения о лицензионных отношениях и отчислениях продавцу
 * 
 * <p>Java class for BuyerSellerRoyaltyFeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerSellerRoyaltyFeeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RoyaltyContractIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RoyaltyFeeIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SubsequentResaleIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerSellerRoyaltyFeeDetailsType", propOrder = {
    "royaltyContractIndicator",
    "royaltyFeeIndicator",
    "subsequentResaleIndicator"
})
public class BuyerSellerRoyaltyFeeDetailsType {

    @XmlElement(name = "RoyaltyContractIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean royaltyContractIndicator;
    @XmlElement(name = "RoyaltyFeeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean royaltyFeeIndicator;
    @XmlElement(name = "SubsequentResaleIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean subsequentResaleIndicator;

    /**
     * Gets the value of the royaltyContractIndicator property.
     * 
     */
    public boolean isRoyaltyContractIndicator() {
        return royaltyContractIndicator;
    }

    /**
     * Sets the value of the royaltyContractIndicator property.
     * 
     */
    public void setRoyaltyContractIndicator(boolean value) {
        this.royaltyContractIndicator = value;
    }

    /**
     * Gets the value of the royaltyFeeIndicator property.
     * 
     */
    public boolean isRoyaltyFeeIndicator() {
        return royaltyFeeIndicator;
    }

    /**
     * Sets the value of the royaltyFeeIndicator property.
     * 
     */
    public void setRoyaltyFeeIndicator(boolean value) {
        this.royaltyFeeIndicator = value;
    }

    /**
     * признак наличия условий, в соответствии с которыми часть дохода (выручки), полученного в результате последующей продажи, распоряжения иным способом или использования ввозимых товаров, прямо или косвенно причитается продавцу
     * 
     */
    public boolean isSubsequentResaleIndicator() {
        return subsequentResaleIndicator;
    }

    /**
     * Sets the value of the subsequentResaleIndicator property.
     * 
     */
    public void setSubsequentResaleIndicator(boolean value) {
        this.subsequentResaleIndicator = value;
    }

}
