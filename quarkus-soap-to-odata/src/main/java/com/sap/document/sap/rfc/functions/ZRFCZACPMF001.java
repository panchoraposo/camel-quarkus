
package com.sap.document.sap.rfc.functions;

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
 *         &lt;element name="IS_ORDEN_HEADER" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_CABECERA"/&gt;
 *         &lt;element name="IT_COMPONENTES"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_COMPONENTE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IT_OPERACIONES"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_OPERACION" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlRootElement(name = "Z_RFC_ZACPMF001")
public class ZRFCZACPMF001 {

    @XmlElement(name = "IS_ORDEN_HEADER", required = true)
    protected ZACPMEORDENCABECERA isordenheader;
    @XmlElement(name = "IT_COMPONENTES", required = true)
    protected ZRFCZACPMF001 .ITCOMPONENTES itcomponentes;
    @XmlElement(name = "IT_OPERACIONES", required = true)
    protected ZRFCZACPMF001 .ITOPERACIONES itoperaciones;

    /**
     * Gets the value of the isordenheader property.
     * 
     * @return
     *     possible object is
     *     {@link ZACPMEORDENCABECERA }
     *     
     */
    public ZACPMEORDENCABECERA getISORDENHEADER() {
        return isordenheader;
    }

    /**
     * Sets the value of the isordenheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZACPMEORDENCABECERA }
     *     
     */
    public void setISORDENHEADER(ZACPMEORDENCABECERA value) {
        this.isordenheader = value;
    }

    /**
     * Gets the value of the itcomponentes property.
     * 
     * @return
     *     possible object is
     *     {@link ZRFCZACPMF001 .ITCOMPONENTES }
     *     
     */
    public ZRFCZACPMF001 .ITCOMPONENTES getITCOMPONENTES() {
        return itcomponentes;
    }

    /**
     * Sets the value of the itcomponentes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZRFCZACPMF001 .ITCOMPONENTES }
     *     
     */
    public void setITCOMPONENTES(ZRFCZACPMF001 .ITCOMPONENTES value) {
        this.itcomponentes = value;
    }

    /**
     * Gets the value of the itoperaciones property.
     * 
     * @return
     *     possible object is
     *     {@link ZRFCZACPMF001 .ITOPERACIONES }
     *     
     */
    public ZRFCZACPMF001 .ITOPERACIONES getITOPERACIONES() {
        return itoperaciones;
    }

    /**
     * Sets the value of the itoperaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZRFCZACPMF001 .ITOPERACIONES }
     *     
     */
    public void setITOPERACIONES(ZRFCZACPMF001 .ITOPERACIONES value) {
        this.itoperaciones = value;
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_COMPONENTE" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ITCOMPONENTES {

        protected List<ZACPMEORDENCOMPONENTE> item;

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
         * {@link ZACPMEORDENCOMPONENTE }
         * 
         * 
         */
        public List<ZACPMEORDENCOMPONENTE> getItem() {
            if (item == null) {
                item = new ArrayList<ZACPMEORDENCOMPONENTE>();
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
     *         &lt;element name="item" type="{urn:sap-com:document:sap:rfc:functions}ZACPME_ORDEN_OPERACION" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    public static class ITOPERACIONES {

        protected List<ZACPMEORDENOPERACION> item;

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
         * {@link ZACPMEORDENOPERACION }
         * 
         * 
         */
        public List<ZACPMEORDENOPERACION> getItem() {
            if (item == null) {
                item = new ArrayList<ZACPMEORDENOPERACION>();
            }
            return this.item;
        }

    }

}
