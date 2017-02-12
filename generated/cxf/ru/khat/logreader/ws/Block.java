
package ru.khat.logreader.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for block complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="block"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textBlock" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="thread" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlGCDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "block", propOrder = {
    "textBlock",
    "thread",
    "xmlGCDate"
})
public class Block {

    protected String textBlock;
    protected String thread;
    @XmlSchemaType(name = "anySimpleType")
    protected Object xmlGCDate;

    /**
     * Gets the value of the textBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextBlock() {
        return textBlock;
    }

    /**
     * Sets the value of the textBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextBlock(String value) {
        this.textBlock = value;
    }

    /**
     * Gets the value of the thread property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThread() {
        return thread;
    }

    /**
     * Sets the value of the thread property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThread(String value) {
        this.thread = value;
    }

    /**
     * Gets the value of the xmlGCDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXmlGCDate() {
        return xmlGCDate;
    }

    /**
     * Sets the value of the xmlGCDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXmlGCDate(Object value) {
        this.xmlGCDate = value;
    }

}
