//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import keden.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CACountryCodeType;
import keden.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransportTypeCodeType;
import keden.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import keden.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import keden.xsd_gen.eec.m.simpledataobjects_v0_4.VehicleMakeCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о регистрационном номере и идентификаторах транспортного средства
 * 
 * <p>Java class for TransportMeansItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RegistrationNationalityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleMakeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleModelName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansItemDetailsType", propOrder = {
    "objectOrdinal",
    "unifiedTransportModeCode",
    "registrationNationalityCode",
    "transportMeansRegId",
    "vehicleId",
    "transportTypeCode",
    "vehicleMakeCode",
    "vehicleModelName",
    "docId"
})
@XmlSeeAlso({
    TranshipmentTransportMeansDetailsType.class
})
public class TransportMeansItemDetailsType {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "UnifiedTransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedTransportModeCode;
    @XmlElement(name = "RegistrationNationalityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CACountryCodeType registrationNationalityCode;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected TransportMeansRegIdType transportMeansRegId;
    @XmlElement(name = "VehicleId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleId;
    @XmlElement(name = "TransportTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected TransportTypeCodeType transportTypeCode;
    @XmlElement(name = "VehicleMakeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected VehicleMakeCodeType vehicleMakeCode;
    @XmlElement(name = "VehicleModelName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleModelName;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;

    /**
     * Порядковый номер транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectOrdinal() {
        return objectOrdinal;
    }

    /**
     * Sets the value of the objectOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectOrdinal(BigInteger value) {
        this.objectOrdinal = value;
    }

    /**
     * Gets the value of the unifiedTransportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedTransportModeCode() {
        return unifiedTransportModeCode;
    }

    /**
     * Sets the value of the unifiedTransportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedTransportModeCode(UnifiedCode20Type value) {
        this.unifiedTransportModeCode = value;
    }

    /**
     * Gets the value of the registrationNationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryCodeType }
     *     
     */
    public CACountryCodeType getRegistrationNationalityCode() {
        return registrationNationalityCode;
    }

    /**
     * Sets the value of the registrationNationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryCodeType }
     *     
     */
    public void setRegistrationNationalityCode(CACountryCodeType value) {
        this.registrationNationalityCode = value;
    }

    /**
     * регистрационный номер автомобильного транспортного средства, прицепа, полуприцепа, название водного судна, номер рейса воздушного судна, номер железнодорожного транспортного средства (вагона, полувагона, платформы, цистерны и т.п.), идентификационный номер контейнера
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public TransportMeansRegIdType getTransportMeansRegId() {
        return transportMeansRegId;
    }

    /**
     * Sets the value of the transportMeansRegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public void setTransportMeansRegId(TransportMeansRegIdType value) {
        this.transportMeansRegId = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleId(String value) {
        this.vehicleId = value;
    }

    /**
     * кодовое обозначение типа транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeCodeType }
     *     
     */
    public TransportTypeCodeType getTransportTypeCode() {
        return transportTypeCode;
    }

    /**
     * Sets the value of the transportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeCodeType }
     *     
     */
    public void setTransportTypeCode(TransportTypeCodeType value) {
        this.transportTypeCode = value;
    }

    /**
     * кодовое обозначение марки транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link VehicleMakeCodeType }
     *     
     */
    public VehicleMakeCodeType getVehicleMakeCode() {
        return vehicleMakeCode;
    }

    /**
     * Sets the value of the vehicleMakeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMakeCodeType }
     *     
     */
    public void setVehicleMakeCode(VehicleMakeCodeType value) {
        this.vehicleMakeCode = value;
    }

    /**
     * Наименование модели транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModelName() {
        return vehicleModelName;
    }

    /**
     * Sets the value of the vehicleModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModelName(String value) {
        this.vehicleModelName = value;
    }

    /**
     * Номер свидетельства о регистрации транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

}
