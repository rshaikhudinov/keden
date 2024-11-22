//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.22 at 10:36:34 PM QYZT 
//


package keden.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationChannelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommunicationChannelCodeType"&gt;
 *   &lt;restriction base="{urn:EEC:M:BaseDataTypes:v0.4.14}CodeType"&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="FX"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommunicationChannelCodeType")
@XmlEnum
public enum CommunicationChannelCodeType {


    /**
     * адрес сайта в сети Интернет
     * 
     */
    AO,

    /**
     * электронная почта
     * 
     */
    EM,

    /**
     * телефакс
     * 
     */
    FX,

    /**
     * телефон
     * 
     */
    TE,

    /**
     * телеграф
     * 
     */
    TG,

    /**
     * телекс
     * 
     */
    TL;

    public String value() {
        return name();
    }

    public static CommunicationChannelCodeType fromValue(String v) {
        return valueOf(v);
    }

}
