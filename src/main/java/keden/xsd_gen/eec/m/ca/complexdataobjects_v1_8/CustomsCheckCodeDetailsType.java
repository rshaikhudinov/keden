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
 * Компоненты, представляющие сведения о коде проверки таможенных, иных документов и (или) сведений
 * 
 * <p>Java class for CustomsCheckCodeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsCheckCodeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WeightCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OriginalCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CommodityCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FactPaymentCheckIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsCheckCodeDetailsType", propOrder = {
    "weightCheckIndicator",
    "originalCheckIndicator",
    "commodityCheckIndicator",
    "customsValueCheckIndicator",
    "dutyTaxFeeCheckIndicator",
    "factPaymentCheckIndicator"
})
public class CustomsCheckCodeDetailsType {

    @XmlElement(name = "WeightCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean weightCheckIndicator;
    @XmlElement(name = "OriginalCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean originalCheckIndicator;
    @XmlElement(name = "CommodityCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean commodityCheckIndicator;
    @XmlElement(name = "CustomsValueCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean customsValueCheckIndicator;
    @XmlElement(name = "DutyTaxFeeCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean dutyTaxFeeCheckIndicator;
    @XmlElement(name = "FactPaymentCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean factPaymentCheckIndicator;

    /**
     * Gets the value of the weightCheckIndicator property.
     * 
     */
    public boolean isWeightCheckIndicator() {
        return weightCheckIndicator;
    }

    /**
     * Sets the value of the weightCheckIndicator property.
     * 
     */
    public void setWeightCheckIndicator(boolean value) {
        this.weightCheckIndicator = value;
    }

    /**
     * Gets the value of the originalCheckIndicator property.
     * 
     */
    public boolean isOriginalCheckIndicator() {
        return originalCheckIndicator;
    }

    /**
     * Sets the value of the originalCheckIndicator property.
     * 
     */
    public void setOriginalCheckIndicator(boolean value) {
        this.originalCheckIndicator = value;
    }

    /**
     * Gets the value of the commodityCheckIndicator property.
     * 
     */
    public boolean isCommodityCheckIndicator() {
        return commodityCheckIndicator;
    }

    /**
     * Sets the value of the commodityCheckIndicator property.
     * 
     */
    public void setCommodityCheckIndicator(boolean value) {
        this.commodityCheckIndicator = value;
    }

    /**
     * Gets the value of the customsValueCheckIndicator property.
     * 
     */
    public boolean isCustomsValueCheckIndicator() {
        return customsValueCheckIndicator;
    }

    /**
     * Sets the value of the customsValueCheckIndicator property.
     * 
     */
    public void setCustomsValueCheckIndicator(boolean value) {
        this.customsValueCheckIndicator = value;
    }

    /**
     * Gets the value of the dutyTaxFeeCheckIndicator property.
     * 
     */
    public boolean isDutyTaxFeeCheckIndicator() {
        return dutyTaxFeeCheckIndicator;
    }

    /**
     * Sets the value of the dutyTaxFeeCheckIndicator property.
     * 
     */
    public void setDutyTaxFeeCheckIndicator(boolean value) {
        this.dutyTaxFeeCheckIndicator = value;
    }

    /**
     * Gets the value of the factPaymentCheckIndicator property.
     * 
     */
    public boolean isFactPaymentCheckIndicator() {
        return factPaymentCheckIndicator;
    }

    /**
     * Sets the value of the factPaymentCheckIndicator property.
     * 
     */
    public void setFactPaymentCheckIndicator(boolean value) {
        this.factPaymentCheckIndicator = value;
    }

}
