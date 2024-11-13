
package com.sap.document.sap.rfc.functions;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * ALM Order BAPIs: Structure for Order Costs Sum
 * 
 * <p>Java class for BAPI_ALM_ORDER_COSTS_SUM_E complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BAPI_ALM_ORDER_COSTS_SUM_E"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOTAL_COSTS_ACT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_COSTS_PLAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_COSTS_EST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_SETTLEMENT_COSTS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_REVENUES_ACT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_REVENUES_PLAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_REVENUES_EST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_SUM_ACT" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_SUM_PLAN" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TOTAL_SUM_EST" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="15"/&gt;
 *               &lt;fractionDigits value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CURRENCY" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CURRENCY_ISO" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="3"/&gt;
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
@XmlType(name = "BAPI_ALM_ORDER_COSTS_SUM_E", propOrder = {
    "totalcostsact",
    "totalcostsplan",
    "totalcostsest",
    "totalsettlementcosts",
    "totalrevenuesact",
    "totalrevenuesplan",
    "totalrevenuesest",
    "totalsumact",
    "totalsumplan",
    "totalsumest",
    "currency",
    "currencyiso"
})
public class BAPIALMORDERCOSTSSUME {

    @XmlElement(name = "TOTAL_COSTS_ACT")
    protected BigDecimal totalcostsact;
    @XmlElement(name = "TOTAL_COSTS_PLAN")
    protected BigDecimal totalcostsplan;
    @XmlElement(name = "TOTAL_COSTS_EST")
    protected BigDecimal totalcostsest;
    @XmlElement(name = "TOTAL_SETTLEMENT_COSTS")
    protected BigDecimal totalsettlementcosts;
    @XmlElement(name = "TOTAL_REVENUES_ACT")
    protected BigDecimal totalrevenuesact;
    @XmlElement(name = "TOTAL_REVENUES_PLAN")
    protected BigDecimal totalrevenuesplan;
    @XmlElement(name = "TOTAL_REVENUES_EST")
    protected BigDecimal totalrevenuesest;
    @XmlElement(name = "TOTAL_SUM_ACT")
    protected BigDecimal totalsumact;
    @XmlElement(name = "TOTAL_SUM_PLAN")
    protected BigDecimal totalsumplan;
    @XmlElement(name = "TOTAL_SUM_EST")
    protected BigDecimal totalsumest;
    @XmlElement(name = "CURRENCY")
    protected String currency;
    @XmlElement(name = "CURRENCY_ISO")
    protected String currencyiso;

    /**
     * Gets the value of the totalcostsact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALCOSTSACT() {
        return totalcostsact;
    }

    /**
     * Sets the value of the totalcostsact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALCOSTSACT(BigDecimal value) {
        this.totalcostsact = value;
    }

    /**
     * Gets the value of the totalcostsplan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALCOSTSPLAN() {
        return totalcostsplan;
    }

    /**
     * Sets the value of the totalcostsplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALCOSTSPLAN(BigDecimal value) {
        this.totalcostsplan = value;
    }

    /**
     * Gets the value of the totalcostsest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALCOSTSEST() {
        return totalcostsest;
    }

    /**
     * Sets the value of the totalcostsest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALCOSTSEST(BigDecimal value) {
        this.totalcostsest = value;
    }

    /**
     * Gets the value of the totalsettlementcosts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALSETTLEMENTCOSTS() {
        return totalsettlementcosts;
    }

    /**
     * Sets the value of the totalsettlementcosts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALSETTLEMENTCOSTS(BigDecimal value) {
        this.totalsettlementcosts = value;
    }

    /**
     * Gets the value of the totalrevenuesact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALREVENUESACT() {
        return totalrevenuesact;
    }

    /**
     * Sets the value of the totalrevenuesact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALREVENUESACT(BigDecimal value) {
        this.totalrevenuesact = value;
    }

    /**
     * Gets the value of the totalrevenuesplan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALREVENUESPLAN() {
        return totalrevenuesplan;
    }

    /**
     * Sets the value of the totalrevenuesplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALREVENUESPLAN(BigDecimal value) {
        this.totalrevenuesplan = value;
    }

    /**
     * Gets the value of the totalrevenuesest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALREVENUESEST() {
        return totalrevenuesest;
    }

    /**
     * Sets the value of the totalrevenuesest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALREVENUESEST(BigDecimal value) {
        this.totalrevenuesest = value;
    }

    /**
     * Gets the value of the totalsumact property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALSUMACT() {
        return totalsumact;
    }

    /**
     * Sets the value of the totalsumact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALSUMACT(BigDecimal value) {
        this.totalsumact = value;
    }

    /**
     * Gets the value of the totalsumplan property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALSUMPLAN() {
        return totalsumplan;
    }

    /**
     * Sets the value of the totalsumplan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALSUMPLAN(BigDecimal value) {
        this.totalsumplan = value;
    }

    /**
     * Gets the value of the totalsumest property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTOTALSUMEST() {
        return totalsumest;
    }

    /**
     * Sets the value of the totalsumest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTOTALSUMEST(BigDecimal value) {
        this.totalsumest = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCY() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCY(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the currencyiso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENCYISO() {
        return currencyiso;
    }

    /**
     * Sets the value of the currencyiso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENCYISO(String value) {
        this.currencyiso = value;
    }

}
