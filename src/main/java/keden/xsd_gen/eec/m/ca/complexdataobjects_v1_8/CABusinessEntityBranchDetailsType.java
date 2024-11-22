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
 * компоненты, представляющие сведения о субъекте
 * 
 * <p>Java class for CABusinessEntityBranchDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABusinessEntityBranchDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CABusinessEntityDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BranchDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABusinessEntityBranchDetailsType", propOrder = {
    "branchDetails"
})
public class CABusinessEntityBranchDetailsType
    extends CABusinessEntityDetailsType
{

    @XmlElement(name = "BranchDetails")
    protected CAOrganizationType branchDetails;

    /**
     * Gets the value of the branchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CAOrganizationType }
     *     
     */
    public CAOrganizationType getBranchDetails() {
        return branchDetails;
    }

    /**
     * Sets the value of the branchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAOrganizationType }
     *     
     */
    public void setBranchDetails(CAOrganizationType value) {
        this.branchDetails = value;
    }

}
