
package com.sap.document.sap.rfc.functions;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZACPME_ORDEN_COMPONENTE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZACPME_ORDEN_COMPONENTE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACTIVITY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MATERIAL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REQUIREMENT_QUANTITY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="13"/&gt;
 *               &lt;fractionDigits value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="REQUIREMENT_QUANTITY_UNIT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOTE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="STGE_LOC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ITEM_CAT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PUR_GROUP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PURCH_ORG" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PREQ_NAME" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="GR_RCPT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UNLOAD_PT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGREEMENT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AGMT_ITEM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *               &lt;pattern value="\d+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZACPME_ORDEN_COMPONENTE", propOrder = {
    "activity",
    "material",
    "requirementquantity",
    "requirementquantityunit",
    "lote",
    "stgeloc",
    "itemcat",
    "purgroup",
    "purchorg",
    "preqname",
    "grrcpt",
    "unloadpt",
    "agreement",
    "agmtitem"
})
public class ZACPMEORDENCOMPONENTE {

    @XmlElement(name = "ACTIVITY")
    protected String activity;
    @XmlElement(name = "MATERIAL")
    protected String material;
    @XmlElement(name = "REQUIREMENT_QUANTITY")
    protected BigDecimal requirementquantity;
    @XmlElement(name = "REQUIREMENT_QUANTITY_UNIT")
    protected String requirementquantityunit;
    @XmlElement(name = "LOTE")
    protected String lote;
    @XmlElement(name = "STGE_LOC")
    protected String stgeloc;
    @XmlElement(name = "ITEM_CAT")
    protected String itemcat;
    @XmlElement(name = "PUR_GROUP")
    protected String purgroup;
    @XmlElement(name = "PURCH_ORG")
    protected String purchorg;
    @XmlElement(name = "PREQ_NAME")
    protected String preqname;
    @XmlElement(name = "GR_RCPT")
    protected String grrcpt;
    @XmlElement(name = "UNLOAD_PT")
    protected String unloadpt;
    @XmlElement(name = "AGREEMENT")
    protected String agreement;
    @XmlElement(name = "AGMT_ITEM")
    protected String agmtitem;

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTIVITY() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTIVITY(String value) {
        this.activity = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATERIAL() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATERIAL(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the requirementquantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getREQUIREMENTQUANTITY() {
        return requirementquantity;
    }

    /**
     * Sets the value of the requirementquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setREQUIREMENTQUANTITY(BigDecimal value) {
        this.requirementquantity = value;
    }

    /**
     * Gets the value of the requirementquantityunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUIREMENTQUANTITYUNIT() {
        return requirementquantityunit;
    }

    /**
     * Sets the value of the requirementquantityunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUIREMENTQUANTITYUNIT(String value) {
        this.requirementquantityunit = value;
    }

    /**
     * Gets the value of the lote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOTE() {
        return lote;
    }

    /**
     * Sets the value of the lote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOTE(String value) {
        this.lote = value;
    }

    /**
     * Gets the value of the stgeloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTGELOC() {
        return stgeloc;
    }

    /**
     * Sets the value of the stgeloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTGELOC(String value) {
        this.stgeloc = value;
    }

    /**
     * Gets the value of the itemcat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMCAT() {
        return itemcat;
    }

    /**
     * Sets the value of the itemcat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMCAT(String value) {
        this.itemcat = value;
    }

    /**
     * Gets the value of the purgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURGROUP() {
        return purgroup;
    }

    /**
     * Sets the value of the purgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURGROUP(String value) {
        this.purgroup = value;
    }

    /**
     * Gets the value of the purchorg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURCHORG() {
        return purchorg;
    }

    /**
     * Sets the value of the purchorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURCHORG(String value) {
        this.purchorg = value;
    }

    /**
     * Gets the value of the preqname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREQNAME() {
        return preqname;
    }

    /**
     * Sets the value of the preqname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREQNAME(String value) {
        this.preqname = value;
    }

    /**
     * Gets the value of the grrcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGRRCPT() {
        return grrcpt;
    }

    /**
     * Sets the value of the grrcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGRRCPT(String value) {
        this.grrcpt = value;
    }

    /**
     * Gets the value of the unloadpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNLOADPT() {
        return unloadpt;
    }

    /**
     * Sets the value of the unloadpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNLOADPT(String value) {
        this.unloadpt = value;
    }

    /**
     * Gets the value of the agreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGREEMENT() {
        return agreement;
    }

    /**
     * Sets the value of the agreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGREEMENT(String value) {
        this.agreement = value;
    }

    /**
     * Gets the value of the agmtitem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGMTITEM() {
        return agmtitem;
    }

    /**
     * Sets the value of the agmtitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGMTITEM(String value) {
        this.agmtitem = value;
    }

}
