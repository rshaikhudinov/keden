//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import keden.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о товаре
 * 
 * <p>Java class for ECGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}HMConsignmentItemNumber"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TradeMarkName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProductionPlaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IPObjectRegistryIdDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ECPrecedingDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ECPresentedDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ECChangeDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECGoodsItemDetailsType", propOrder = {
    "hmConsignmentItemNumber",
    "tradeMarkName",
    "productionPlaceName",
    "ipObjectRegistryIdDetails",
    "caValueAmount",
    "customsValueAmount",
    "ecPrecedingDocDetails",
    "ecPresentedDocDetails",
    "descriptionText",
    "customsPaymentDetails",
    "ecChangeDetails"
})
public class ECGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "HMConsignmentItemNumber", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected BigDecimal hmConsignmentItemNumber;
    @XmlElement(name = "TradeMarkName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tradeMarkName;
    @XmlElement(name = "ProductionPlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productionPlaceName;
    @XmlElement(name = "IPObjectRegistryIdDetails")
    protected List<IPObjectRegistryIdDetailsType> ipObjectRegistryIdDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<PaymentAmountWithCurrencyType> caValueAmount;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "ECPrecedingDocDetails")
    protected List<ECPrecedingDocDetailsType> ecPrecedingDocDetails;
    @XmlElement(name = "ECPresentedDocDetails")
    protected List<ECPresentedDocDetailsType> ecPresentedDocDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "CustomsPaymentDetails")
    protected List<GoodsItemPaymentDetailsType> customsPaymentDetails;
    @XmlElement(name = "ECChangeDetails")
    protected ECChangeDetailsType ecChangeDetails;

    /**
     * Gets the value of the hmConsignmentItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHMConsignmentItemNumber() {
        return hmConsignmentItemNumber;
    }

    /**
     * Sets the value of the hmConsignmentItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHMConsignmentItemNumber(BigDecimal value) {
        this.hmConsignmentItemNumber = value;
    }

    /**
     * Gets the value of the tradeMarkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeMarkName() {
        return tradeMarkName;
    }

    /**
     * Sets the value of the tradeMarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeMarkName(String value) {
        this.tradeMarkName = value;
    }

    /**
     * Gets the value of the productionPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionPlaceName() {
        return productionPlaceName;
    }

    /**
     * Sets the value of the productionPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionPlaceName(String value) {
        this.productionPlaceName = value;
    }

    /**
     * Gets the value of the ipObjectRegistryIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ipObjectRegistryIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPObjectRegistryIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPObjectRegistryIdDetailsType }
     * 
     * 
     */
    public List<IPObjectRegistryIdDetailsType> getIPObjectRegistryIdDetails() {
        if (ipObjectRegistryIdDetails == null) {
            ipObjectRegistryIdDetails = new ArrayList<IPObjectRegistryIdDetailsType>();
        }
        return this.ipObjectRegistryIdDetails;
    }

    /**
     * Стоимость товара Gets the value of the caValueAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caValueAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAValueAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentAmountWithCurrencyType }
     * 
     * 
     */
    public List<PaymentAmountWithCurrencyType> getCAValueAmount() {
        if (caValueAmount == null) {
            caValueAmount = new ArrayList<PaymentAmountWithCurrencyType>();
        }
        return this.caValueAmount;
    }

    /**
     * Таможенная стоимость товара
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCustomsValueAmount() {
        return customsValueAmount;
    }

    /**
     * Sets the value of the customsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCustomsValueAmount(PaymentAmountWithCurrencyType value) {
        this.customsValueAmount = value;
    }

    /**
     * Gets the value of the ecPrecedingDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ecPrecedingDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECPrecedingDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECPrecedingDocDetailsType }
     * 
     * 
     */
    public List<ECPrecedingDocDetailsType> getECPrecedingDocDetails() {
        if (ecPrecedingDocDetails == null) {
            ecPrecedingDocDetails = new ArrayList<ECPrecedingDocDetailsType>();
        }
        return this.ecPrecedingDocDetails;
    }

    /**
     * Gets the value of the ecPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ecPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECPresentedDocDetailsType }
     * 
     * 
     */
    public List<ECPresentedDocDetailsType> getECPresentedDocDetails() {
        if (ecPresentedDocDetails == null) {
            ecPresentedDocDetails = new ArrayList<ECPresentedDocDetailsType>();
        }
        return this.ecPresentedDocDetails;
    }

    /**
     * Примечание
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * Сведения об исчислении таможенных пошлин, налогов Gets the value of the customsPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemPaymentDetailsType }
     * 
     * 
     */
    public List<GoodsItemPaymentDetailsType> getCustomsPaymentDetails() {
        if (customsPaymentDetails == null) {
            customsPaymentDetails = new ArrayList<GoodsItemPaymentDetailsType>();
        }
        return this.customsPaymentDetails;
    }

    /**
     * Gets the value of the ecChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ECChangeDetailsType }
     *     
     */
    public ECChangeDetailsType getECChangeDetails() {
        return ecChangeDetails;
    }

    /**
     * Sets the value of the ecChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECChangeDetailsType }
     *     
     */
    public void setECChangeDetails(ECChangeDetailsType value) {
        this.ecChangeDetails = value;
    }

}
