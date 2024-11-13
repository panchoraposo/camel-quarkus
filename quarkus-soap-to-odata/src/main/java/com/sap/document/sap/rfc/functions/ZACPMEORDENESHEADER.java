
package com.sap.document.sap.rfc.functions;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZACPME_ORDEN_ES_HEADER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZACPME_ORDEN_ES_HEADER"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ORDERID" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="12"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LOCATION" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SYSSTATUS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="40"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RESERV_NO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
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
@XmlType(name = "ZACPME_ORDEN_ES_HEADER", propOrder = {
    "orderid",
    "location",
    "sysstatus",
    "reservno"
})
public class ZACPMEORDENESHEADER {

    @XmlElement(name = "ORDERID")
    protected String orderid;
    @XmlElement(name = "LOCATION")
    protected String location;
    @XmlElement(name = "SYSSTATUS")
    protected String sysstatus;
    @XmlElement(name = "RESERV_NO")
    protected String reservno;

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCATION() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCATION(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the sysstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSYSSTATUS() {
        return sysstatus;
    }

    /**
     * Sets the value of the sysstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSYSSTATUS(String value) {
        this.sysstatus = value;
    }

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

}
