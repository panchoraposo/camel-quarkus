
package com.sap.document.sap.rfc.functions;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZACPME_ORDEN_ES_COMPONENTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZACPME_ORDEN_ES_COMPONENTS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RESERV_NO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;pattern value="\d+"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RES_ITEM" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
 *               &lt;pattern value="\d+"/&gt;
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
 *         &lt;element name="ITEM_NUMBER" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4"/&gt;
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
@XmlType(name = "ZACPME_ORDEN_ES_COMPONENTS", propOrder = {
    "reservno",
    "resitem",
    "itemcat",
    "itemnumber",
    "preqno",
    "preqitem",
    "agreement",
    "agmitem"
})
public class ZACPMEORDENESCOMPONENTS {

    @XmlElement(name = "RESERV_NO")
    protected String reservno;
    @XmlElement(name = "RES_ITEM")
    protected String resitem;
    @XmlElement(name = "ITEM_CAT")
    protected String itemcat;
    @XmlElement(name = "ITEM_NUMBER")
    protected String itemnumber;
    @XmlElement(name = "PREQ_NO")
    protected String preqno;
    @XmlElement(name = "PREQ_ITEM")
    protected String preqitem;
    @XmlElement(name = "AGREEMENT")
    protected String agreement;
    @XmlElement(name = "AGM_ITEM")
    protected String agmitem;

    /**
     * Gets the value of the reservno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESERVNO() {
        return reservno;
    }

    /**
     * Sets the value of the reservno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESERVNO(String value) {
        this.reservno = value;
    }

    /**
     * Gets the value of the resitem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESITEM() {
        return resitem;
    }

    /**
     * Sets the value of the resitem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESITEM(String value) {
        this.resitem = value;
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
     * Gets the value of the itemnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITEMNUMBER() {
        return itemnumber;
    }

    /**
     * Sets the value of the itemnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITEMNUMBER(String value) {
        this.itemnumber = value;
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
