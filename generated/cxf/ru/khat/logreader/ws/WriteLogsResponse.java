
package ru.khat.logreader.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for writeLogsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="writeLogsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://ws.logreader.khat.ru/}outputData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeLogsResponse", propOrder = {
    "_return"
})
public class WriteLogsResponse {

    @XmlElement(name = "return")
    protected OutputData _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link OutputData }
     *     
     */
    public OutputData getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputData }
     *     
     */
    public void setReturn(OutputData value) {
        this._return = value;
    }

}
