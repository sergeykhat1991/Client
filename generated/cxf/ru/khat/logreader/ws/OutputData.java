
package ru.khat.logreader.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="outputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="list" type="{http://ws.logreader.khat.ru/}block" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="urlFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outputData", propOrder = {
    "list",
    "urlFile"
})
public class OutputData {

    @XmlElement(nillable = true)
    protected List<Block> list;
    protected String urlFile;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Block }
     * 
     * 
     */
    public List<Block> getList() {
        if (list == null) {
            list = new ArrayList<Block>();
        }
        return this.list;
    }

    /**
     * Gets the value of the urlFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlFile() {
        return urlFile;
    }

    /**
     * Sets the value of the urlFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlFile(String value) {
        this.urlFile = value;
    }

}
