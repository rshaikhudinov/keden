//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import keden.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CACountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об операции по перегрузке товара
 * 
 * <p>Java class for TranshipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranshipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoOperationKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CarrierOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsTranshsipmentIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CACountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RailwayStationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TranshipmentTransportMeansDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranshipmentDetailsType", propOrder = {
    "cargoOperationKindCode",
    "carrierOrdinal",
    "goodsTranshsipmentIndicator",
    "caCountryCode",
    "placeName",
    "customsOfficeCode",
    "railwayStationCode",
    "transhipmentTransportMeansDetails",
    "descriptionText"
})
public class TranshipmentDetailsType {

    @XmlElement(name = "CargoOperationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cargoOperationKindCode;
    @XmlElement(name = "CarrierOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger carrierOrdinal;
    @XmlElement(name = "GoodsTranshsipmentIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean goodsTranshsipmentIndicator;
    @XmlElement(name = "CACountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CACountryCodeType caCountryCode;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "RailwayStationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String railwayStationCode;
    @XmlElement(name = "TranshipmentTransportMeansDetails")
    protected List<TranshipmentTransportMeansDetailsType> transhipmentTransportMeansDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the cargoOperationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoOperationKindCode() {
        return cargoOperationKindCode;
    }

    /**
     * Sets the value of the cargoOperationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoOperationKindCode(String value) {
        this.cargoOperationKindCode = value;
    }

    /**
     * порядковый номер перевозчика, который продолжает перевозку (транспортировку) товаров
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarrierOrdinal() {
        return carrierOrdinal;
    }

    /**
     * Sets the value of the carrierOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarrierOrdinal(BigInteger value) {
        this.carrierOrdinal = value;
    }

    /**
     * Признак перегрузки товаров из одного контейнера в другой
     * 
     */
    public boolean isGoodsTranshsipmentIndicator() {
        return goodsTranshsipmentIndicator;
    }

    /**
     * Sets the value of the goodsTranshsipmentIndicator property.
     * 
     */
    public void setGoodsTranshsipmentIndicator(boolean value) {
        this.goodsTranshsipmentIndicator = value;
    }

    /**
     * Кодовое обозначение страны
     * 
     * @return
     *     possible object is
     *     {@link CACountryCodeType }
     *     
     */
    public CACountryCodeType getCACountryCode() {
        return caCountryCode;
    }

    /**
     * Sets the value of the caCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryCodeType }
     *     
     */
    public void setCACountryCode(CACountryCodeType value) {
        this.caCountryCode = value;
    }

    /**
     * Наименование населенного пункта
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the customsOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    /**
     * Sets the value of the customsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeCode(String value) {
        this.customsOfficeCode = value;
    }

    /**
     * Кодовое обозначение железнодорожной странции
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailwayStationCode() {
        return railwayStationCode;
    }

    /**
     * Sets the value of the railwayStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailwayStationCode(String value) {
        this.railwayStationCode = value;
    }

    /**
     * сведения о транспортном средстве, с использованием которого продолжается перевозка (транспортировка) товаров Gets the value of the transhipmentTransportMeansDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transhipmentTransportMeansDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranshipmentTransportMeansDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranshipmentTransportMeansDetailsType }
     * 
     * 
     */
    public List<TranshipmentTransportMeansDetailsType> getTranshipmentTransportMeansDetails() {
        if (transhipmentTransportMeansDetails == null) {
            transhipmentTransportMeansDetails = new ArrayList<TranshipmentTransportMeansDetailsType>();
        }
        return this.transhipmentTransportMeansDetails;
    }

    /**
     * Описание грузовой операции
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

}
