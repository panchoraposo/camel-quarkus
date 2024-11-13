
package com.sap.document.sap.rfc.functions;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZACPME_ORDEN_ES_OPERATIONS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZACPME_ORDEN_ES_OPERATIONS"&gt;
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
 *         &lt;element name="ACTTYPE" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="6"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CONF_NO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;pattern value="\d+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PREQ_NO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PREQ_ITEM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *               &lt;pattern value="\d+"/&gt;
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
 *         &lt;element name="AGM_ITEM" minOccurs="0"&gt;
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
@XmlType(name = "ZACPME_ORDEN_ES_OPERATIONS", propOrder = {
    "activity",
    "acttype",
    "confno",
    "preqno",
    "preqitem",
    "agreement",
    "agmitem"
})
public class ZACPMEORDENESOPERATIONS {

    @XmlElement(name = "ACTIVITY")
    protected String activity;
    @XmlElement(name = "ACTTYPE")
    protected String acttype;
    @XmlElement(name = "CONF_NO")
    protected String confno;
    @XmlElement(name = "PREQ_NO")
    protected String preqno;
    @XmlElement(name = "PREQ_ITEM")
    protected String preqitem;
    @XmlElement(name = "AGREEMENT")
    protected String agreement;
    @XmlElement(name = "AGM_ITEM")
    protected String agmitem;

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
     * Gets the value of the confno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFNO() {
        return confno;
    }

    /**
     * Sets the value of the confno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFNO(String value) {
        this.confno = value;
    }

    /**
     * Gets the value of the preqno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREQNO() {
        return preqno;
    }

    /**
     * Sets the value of the preqno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREQNO(String value) {
        this.preqno = value;
    }

    /**
     * Gets the value of the preqitem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREQITEM() {
        return preqitem;
    }

    /**
     * Sets the value of the preqitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREQITEM(String value) {
        this.preqitem = value;
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
     * Gets the value of the agmitem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAGMITEM() {
        return agmitem;
    }

    /**
     * Sets the value of the agmitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAGMITEM(String value) {
        this.agmitem = value;
    }

}
