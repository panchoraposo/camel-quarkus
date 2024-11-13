
package com.sap.document.sap.rfc.functions;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="ES_COMPONENTES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_ES_COMPONENTS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ES_COSTS_SUM" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPI_ALM_ORDER_COSTS_SUM_E" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ES_HEADER" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_ES_HEADER" minOccurs="0"/&gt;
 *         &lt;element name="ES_OPERACIONES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_ES_OPERATIONS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ET_RETURN" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPIRET2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="E_SUBRC" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Z_RFC_ZACPMF001.Response")
public class ZRFCZACPMF001Response {

    @XmlElement(name = "ES_COMPONENTES")
    protected ZRFCZACPMF001Response.ESCOMPONENTES escomponentes;
    @XmlElement(name = "ES_COSTS_SUM")
    protected ZRFCZACPMF001Response.ESCOSTSSUM escostssum;
    @XmlElement(name = "ES_HEADER")
    protected ZACPMEORDENESHEADER esheader;
    @XmlElement(name = "ES_OPERACIONES")
    protected ZRFCZACPMF001Response.ESOPERACIONES esoperaciones;
    @XmlElement(name = "ET_RETURN")
    protected ZRFCZACPMF001Response.ETRETURN etreturn;
    @XmlElement(name = "E_SUBRC")
    protected BigInteger esubrc;

    /**
     * Gets the value of the escomponentes property.
     * 
     * @return
     *     possible object is
     *     {@link ZRFCZACPMF001Response.ESCOMPONENTES }
     *     
     */
    public ZRFCZACPMF001Response.ESCOMPONENTES getESCOMPONENTES() {
        return escomponentes;
    }

    /**
     * Sets the value of the escomponentes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZRFCZACPMF001Response.ESCOMPONENTES }
     *     
     */
    public void setESCOMPONENTES(ZRFCZACPMF001Response.ESCOMPONENTES value) {
        this.escomponentes = value;
    }

    /**
     * Gets the value of the escostssum property.
     * 
     * @return
     *     possible object is
     *     {@link ZRFCZACPMF001Response.ESCOSTSSUM }
     *     
     */
    public ZRFCZACPMF001Response.ESCOSTSSUM getESCOSTSSUM() {
        return escostssum;
    }

    /**
     * Sets the value of the escostssum property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZRFCZACPMF001Response.ESCOSTSSUM }
     *     
     */
    public void setESCOSTSSUM(ZRFCZACPMF001Response.ESCOSTSSUM value) {
        this.escostssum = value;
    }

    /**
     * Gets the value of the esheader property.
     * 
     * @return
     *     possible object is
     *     {@link ZACPMEORDENESHEADER }
     *     
     */
    public ZACPMEORDENESHEADER getESHEADER() {
        return esheader;
    }

    /**
     * Sets the value of the esheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZACPMEORDENESHEADER }
     *     
     */
    public void setESHEADER(ZACPMEORDENESHEADER value) {
        this.esheader = value;
    }

    /**
     * Gets the value of the esoperaciones property.
     * 
     * @return
     *     possible object is
     *     {@link ZRFCZACPMF001Response.ESOPERACIONES }
     *     
     */
    public ZRFCZACPMF001Response.ESOPERACIONES getESOPERACIONES() {
        return esoperaciones;
    }

    /**
     * Sets the value of the esoperaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZRFCZACPMF001Response.ESOPERACIONES }
     *     
     */
    public void setESOPERACIONES(ZRFCZACPMF001Response.ESOPERACIONES value) {
        this.esoperaciones = value;
    }

    /**
     * Gets the value of the etreturn property.
     * 
     * @return
     *     possible object is
     *     {@link ZRFCZACPMF001Response.ETRETURN }
     *     
     */
    public ZRFCZACPMF001Response.ETRETURN getETRETURN() {
        return etreturn;
    }

    /**
     * Sets the value of the etreturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZRFCZACPMF001Response.ETRETURN }
     *     
     */
    public void setETRETURN(ZRFCZACPMF001Response.ETRETURN value) {
        this.etreturn = value;
    }

    /**
     * Gets the value of the esubrc property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getESUBRC() {
        return esubrc;
    }

    /**
     * Sets the value of the esubrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setESUBRC(BigInteger value) {
        this.esubrc = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_ES_COMPONENTS" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ESCOMPONENTES {

        protected List<ZACPMEORDENESCOMPONENTS> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZACPMEORDENESCOMPONENTS }
         * 
         * 
         */
        public List<ZACPMEORDENESCOMPONENTS> getItem() {
            if (item == null) {
                item = new ArrayList<ZACPMEORDENESCOMPONENTS>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPI_ALM_ORDER_COSTS_SUM_E" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ESCOSTSSUM {

        protected List<BAPIALMORDERCOSTSSUME> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BAPIALMORDERCOSTSSUME }
         * 
         * 
         */
        public List<BAPIALMORDERCOSTSSUME> getItem() {
            if (item == null) {
                item = new ArrayList<BAPIALMORDERCOSTSSUME>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_ES_OPERATIONS" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ESOPERACIONES {

        protected List<ZACPMEORDENESOPERATIONS> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZACPMEORDENESOPERATIONS }
         * 
         * 
         */
        public List<ZACPMEORDENESOPERATIONS> getItem() {
            if (item == null) {
                item = new ArrayList<ZACPMEORDENESOPERATIONS>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}BAPIRET2" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ETRETURN {

        protected List<BAPIRET2> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BAPIRET2 }
         * 
         * 
         */
        public List<BAPIRET2> getItem() {
            if (item == null) {
                item = new ArrayList<BAPIRET2>();
            }
            return this.item;
        }

    }

}
