
package com.sap.document.sap.rfc.functions;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZACPME_ORDEN_CABECERA complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZACPME_ORDEN_CABECERA"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ORDER_TYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ORDERID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SHORT_TEXT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="START_DATE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLANGROUP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FUNCT_LOC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EQUIPMENT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLANPLANT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PLANT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MN_WK_CTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PMACTTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PRIORITY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESPCCTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SYSTCOND" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ASSET_NO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SUB_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SETTLORDER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
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
@XmlType(name = "ZACPME_ORDEN_CABECERA", propOrder = {
    "ordertype",
    "orderid",
    "shorttext",
    "startdate",
    "plangroup",
    "functloc",
    "equipment",
    "planplant",
    "plant",
    "mnwkctr",
    "pmacttype",
    "priority",
    "respcctr",
    "systcond",
    "assetno",
    "subnumber",
    "settlorder"
})
public class ZACPMEORDENCABECERA {

    @XmlElement(name = "ORDER_TYPE")
    protected String ordertype;
    @XmlElement(name = "ORDERID")
    protected String orderid;
    @XmlElement(name = "SHORT_TEXT")
    protected String shorttext;
    @XmlElement(name = "START_DATE")
    protected String startdate;
    @XmlElement(name = "PLANGROUP")
    protected String plangroup;
    @XmlElement(name = "FUNCT_LOC")
    protected String functloc;
    @XmlElement(name = "EQUIPMENT")
    protected String equipment;
    @XmlElement(name = "PLANPLANT")
    protected String planplant;
    @XmlElement(name = "PLANT")
    protected String plant;
    @XmlElement(name = "MN_WK_CTR")
    protected String mnwkctr;
    @XmlElement(name = "PMACTTYPE")
    protected String pmacttype;
    @XmlElement(name = "PRIORITY")
    protected String priority;
    @XmlElement(name = "RESPCCTR")
    protected String respcctr;
    @XmlElement(name = "SYSTCOND")
    protected String systcond;
    @XmlElement(name = "ASSET_NO")
    protected String assetno;
    @XmlElement(name = "SUB_NUMBER")
    protected String subnumber;
    @XmlElement(name = "SETTLORDER")
    protected String settlorder;

    /**
     * Gets the value of the ordertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERTYPE() {
        return ordertype;
    }

    /**
     * Sets the value of the ordertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERTYPE(String value) {
        this.ordertype = value;
    }

    /**
     * Gets the value of the orderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERID() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERID(String value) {
        this.orderid = value;
    }

    /**
     * Gets the value of the shorttext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHORTTEXT() {
        return shorttext;
    }

    /**
     * Sets the value of the shorttext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHORTTEXT(String value) {
        this.shorttext = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTDATE(String value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the plangroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANGROUP() {
        return plangroup;
    }

    /**
     * Sets the value of the plangroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANGROUP(String value) {
        this.plangroup = value;
    }

    /**
     * Gets the value of the functloc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFUNCTLOC() {
        return functloc;
    }

    /**
     * Sets the value of the functloc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFUNCTLOC(String value) {
        this.functloc = value;
    }

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEQUIPMENT() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQUIPMENT(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the planplant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANPLANT() {
        return planplant;
    }

    /**
     * Sets the value of the planplant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANPLANT(String value) {
        this.planplant = value;
    }

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLANT() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLANT(String value) {
        this.plant = value;
    }

    /**
     * Gets the value of the mnwkctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMNWKCTR() {
        return mnwkctr;
    }

    /**
     * Sets the value of the mnwkctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMNWKCTR(String value) {
        this.mnwkctr = value;
    }

    /**
     * Gets the value of the pmacttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMACTTYPE() {
        return pmacttype;
    }

    /**
     * Sets the value of the pmacttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMACTTYPE(String value) {
        this.pmacttype = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIORITY() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIORITY(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the respcctr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESPCCTR() {
        return respcctr;
    }

    /**
     * Sets the value of the respcctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESPCCTR(String value) {
        this.respcctr = value;
    }

    /**
     * Gets the value of the systcond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSTCOND() {
        return systcond;
    }

    /**
     * Sets the value of the systcond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSTCOND(String value) {
        this.systcond = value;
    }

    /**
     * Gets the value of the assetno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASSETNO() {
        return assetno;
    }

    /**
     * Sets the value of the assetno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASSETNO(String value) {
        this.assetno = value;
    }

    /**
     * Gets the value of the subnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBNUMBER() {
        return subnumber;
    }

    /**
     * Sets the value of the subnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBNUMBER(String value) {
        this.subnumber = value;
    }

    /**
     * Gets the value of the settlorder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSETTLORDER() {
        return settlorder;
    }

    /**
     * Sets the value of the settlorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSETTLORDER(String value) {
        this.settlorder = value;
    }

}
