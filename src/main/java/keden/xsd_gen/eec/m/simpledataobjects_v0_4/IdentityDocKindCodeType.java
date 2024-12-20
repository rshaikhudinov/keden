//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, представляющая краткое условное обозначение вида документа, удостоверяющего личность
 * 
 * <p>Java class for IdentityDocKindCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocKindCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:SimpleDataObjects:v0.4.14&gt;Code20Type"&gt;
 *       &lt;attribute name="codeListId" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocKindCodeType", propOrder = {
    "value"
})
public class IdentityDocKindCodeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "codeListId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codeListId;

    /**
     * Строка символов, представляющая краткое условное обозначение объекта в соответствии с некоторым справочником (классификатором), содержащая не более 20 символов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the codeListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListId() {
        return codeListId;
    }

    /**
     * Sets the value of the codeListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListId(String value) {
        this.codeListId = value;
    }

}
