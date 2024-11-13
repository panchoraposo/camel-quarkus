
package com.sap.document.sap.rfc.functions;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZACPME_ORDEN_OPERACION complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZACPME_ORDEN_OPERACION"&gt;
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
 *         &lt;element name="CONTROLKEY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WORK_CNTR" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="8"/&gt;
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
 *         &lt;element name="ACTTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WORK_ACTIVITY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="7"/&gt;
 *               &lt;fractionDigits value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UN_WORK" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DESCRIPTION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CALC_KEY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MATL_GROUP" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VENDOR_NO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
 *         &lt;element name="OPER_QUANTITY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="13"/&gt;
 *               &lt;fractionDigits value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPER_BASE_UOM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OPER_PRICE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
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
 *         &lt;element name="SRVPOS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRV_QUANTITY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="13"/&gt;
 *               &lt;fractionDigits value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRV_UOM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SRV_GROSS_PRICE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="11"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
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
@XmlType(name = "ZACPME_ORDEN_OPERACION", propOrder = {
    "activity",
    "controlkey",
    "workcntr",
    "plant",
    "acttype",
    "workactivity",
    "unwork",
    "description",
    "calckey",
    "matlgroup",
    "vendorno",
    "purgroup",
    "purchorg",
    "operquantity",
    "operbaseuom",
    "operprice",
    "preqname",
    "srvpos",
    "srvquantity",
    "srvuom",
    "srvgrossprice",
    "agreement",
    "agmtitem"
})
public class ZACPMEORDENOPERACION {

    @XmlElement(name = "ACTIVITY")
    protected String activity;
    @XmlElement(name = "CONTROLKEY")
    protected String controlkey;
    @XmlElement(name = "WORK_CNTR")
    protected String workcntr;
    @XmlElement(name = "PLANT")
    protected String plant;
    @XmlElement(name = "ACTTYPE")
    protected String acttype;
    @XmlElement(name = "WORK_ACTIVITY")
    protected BigDecimal workactivity;
    @XmlElement(name = "UN_WORK")
    protected String unwork;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "CALC_KEY")
    protected String calckey;
    @XmlElement(name = "MATL_GROUP")
    protected String matlgroup;
    @XmlElement(name = "VENDOR_NO")
    protected String vendorno;
    @XmlElement(name = "PUR_GROUP")
    protected String purgroup;
    @XmlElement(name = "PURCH_ORG")
    protected String purchorg;
    @XmlElement(name = "OPER_QUANTITY")
    protected BigDecimal operquantity;
    @XmlElement(name = "OPER_BASE_UOM")
    protected String operbaseuom;
    @XmlElement(name = "OPER_PRICE")
    protected BigDecimal operprice;
    @XmlElement(name = "PREQ_NAME")
    protected String preqname;
    @XmlElement(name = "SRVPOS")
    protected String srvpos;
    @XmlElement(name = "SRV_QUANTITY")
    protected BigDecimal srvquantity;
    @XmlElement(name = "SRV_UOM")
    protected String srvuom;
    @XmlElement(name = "SRV_GROSS_PRICE")
    protected BigDecimal srvgrossprice;
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
     * Gets the value of the controlkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTROLKEY() {
        return controlkey;
    }

    /**
     * Sets the value of the controlkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTROLKEY(String value) {
        this.controlkey = value;
    }

    /**
     * Gets the value of the workcntr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWORKCNTR() {
        return workcntr;
    }

    /**
     * Sets the value of the workcntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWORKCNTR(String value) {
        this.workcntr = value;
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
     * Gets the value of the acttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTTYPE() {
        return acttype;
    }

    /**
     * Sets the value of the acttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTTYPE(String value) {
        this.acttype = value;
    }

    /**
     * Gets the value of the workactivity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWORKACTIVITY() {
        return workactivity;
    }

    /**
     * Sets the value of the workactivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWORKACTIVITY(BigDecimal value) {
        this.workactivity = value;
    }

    /**
     * Gets the value of the unwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNWORK() {
        return unwork;
    }

    /**
     * Sets the value of the unwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNWORK(String value) {
        this.unwork = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the calckey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALCKEY() {
        return calckey;
    }

    /**
     * Sets the value of the calckey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALCKEY(String value) {
        this.calckey = value;
    }

    /**
     * Gets the value of the matlgroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMATLGROUP() {
        return matlgroup;
    }

    /**
     * Sets the value of the matlgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMATLGROUP(String value) {
        this.matlgroup = value;
    }

    /**
     * Gets the value of the vendorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVENDORNO() {
        return vendorno;
    }

    /**
     * Sets the value of the vendorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVENDORNO(String value) {
        this.vendorno = value;
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
     * Gets the value of the operquantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOPERQUANTITY() {
        return operquantity;
    }

    /**
     * Sets the value of the operquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOPERQUANTITY(BigDecimal value) {
        this.operquantity = value;
    }

    /**
     * Gets the value of the operbaseuom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPERBASEUOM() {
        return operbaseuom;
    }

    /**
     * Sets the value of the operbaseuom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPERBASEUOM(String value) {
        this.operbaseuom = value;
    }

    /**
     * Gets the value of the operprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOPERPRICE() {
        return operprice;
    }

    /**
     * Sets the value of the operprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOPERPRICE(BigDecimal value) {
        this.operprice = value;
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
     * Gets the value of the srvpos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVPOS() {
        return srvpos;
    }

    /**
     * Sets the value of the srvpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVPOS(String value) {
        this.srvpos = value;
    }

    /**
     * Gets the value of the srvquantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRVQUANTITY() {
        return srvquantity;
    }

    /**
     * Sets the value of the srvquantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRVQUANTITY(BigDecimal value) {
        this.srvquantity = value;
    }

    /**
     * Gets the value of the srvuom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRVUOM() {
        return srvuom;
    }

    /**
     * Sets the value of the srvuom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRVUOM(String value) {
        this.srvuom = value;
    }

    /**
     * Gets the value of the srvgrossprice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSRVGROSSPRICE() {
        return srvgrossprice;
    }

    /**
     * Sets the value of the srvgrossprice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSRVGROSSPRICE(BigDecimal value) {
        this.srvgrossprice = value;
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
