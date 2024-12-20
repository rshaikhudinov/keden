//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import keden.xsd_gen.eec.m.ca.complexdataobjects_v1_8.SignatoryPersonIdentityDetailsType;
import keden.xsd_gen.eec.m.simpledataobjects_v0_4.IdentityDocKindCodeType;
import keden.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об удостоверении личности
 * 
 * <p>Java class for IdentityDocDetailsV3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocDetailsV3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}IdentityDocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocSeriesId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocValidityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocDetailsV3Type", propOrder = {
    "unifiedCountryCode",
    "identityDocKindCode",
    "docKindName",
    "docSeriesId",
    "docId",
    "docCreationDate",
    "docValidityDate",
    "authorityId",
    "authorityName"
})
@XmlSeeAlso({
    SignatoryPersonIdentityDetailsType.class
})
public class IdentityDocDetailsV3Type {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "IdentityDocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected IdentityDocKindCodeType identityDocKindCode;
    @XmlElement(name = "DocKindName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docKindName;
    @XmlElement(name = "DocSeriesId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docSeriesId;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;
    @XmlElement(name = "DocValidityDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docValidityDate;
    @XmlElement(name = "AuthorityId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityId;
    @XmlElement(name = "AuthorityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityName;

    /**
     * Gets the value of the unifiedCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getUnifiedCountryCode() {
        return unifiedCountryCode;
    }

    /**
     * Sets the value of the unifiedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setUnifiedCountryCode(UnifiedCountryCodeType value) {
        this.unifiedCountryCode = value;
    }

    /**
     * Gets the value of the identityDocKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocKindCodeType }
     *     
     */
    public IdentityDocKindCodeType getIdentityDocKindCode() {
        return identityDocKindCode;
    }

    /**
     * Sets the value of the identityDocKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocKindCodeType }
     *     
     */
    public void setIdentityDocKindCode(IdentityDocKindCodeType value) {
        this.identityDocKindCode = value;
    }

    /**
     * Gets the value of the docKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocKindName() {
        return docKindName;
    }

    /**
     * Sets the value of the docKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocKindName(String value) {
        this.docKindName = value;
    }

    /**
     * Gets the value of the docSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSeriesId() {
        return docSeriesId;
    }

    /**
     * Sets the value of the docSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSeriesId(String value) {
        this.docSeriesId = value;
    }

    /**
     * Gets the value of the docId property.
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

    /**
     * Gets the value of the docCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocCreationDate() {
        return docCreationDate;
    }

    /**
     * Sets the value of the docCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocCreationDate(XMLGregorianCalendar value) {
        this.docCreationDate = value;
    }

    /**
     * Gets the value of the docValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocValidityDate() {
        return docValidityDate;
    }

    /**
     * Sets the value of the docValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocValidityDate(XMLGregorianCalendar value) {
        this.docValidityDate = value;
    }

    /**
     * Строка, идентифицирующая орган государственной власти либо уполномоченную им организацию, выдавшую документ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityId() {
        return authorityId;
    }

    /**
     * Sets the value of the authorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityId(String value) {
        this.authorityId = value;
    }

    /**
     * Полное наименование органа государственной власти либо уполномоченной им организации, выдавшей документ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
    }

}
