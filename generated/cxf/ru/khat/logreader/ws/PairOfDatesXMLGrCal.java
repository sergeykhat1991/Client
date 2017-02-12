
package ru.khat.logreader.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pairOfDatesXMLGrCal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pairOfDatesXMLGrCal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pairOfDatesXMLGrCal", propOrder = {
    "from",
    "to"
})
public class PairOfDatesXMLGrCal {

    @XmlSchemaType(name = "anySimpleType")
    protected Object from;
    @XmlSchemaType(name = "anySimpleType")
    protected Object to;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFrom(Object value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTo(Object value) {
        this.to = value;
    }

}
