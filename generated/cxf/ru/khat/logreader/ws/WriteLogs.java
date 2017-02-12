
package ru.khat.logreader.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for writeLogs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="writeLogs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="outputFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateFromXMLGrCal" type="{http://ws.logreader.khat.ru/}pairOfDatesXMLGrCal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeLogs", propOrder = {
    "searchIn",
    "input",
    "outputFormat",
    "dateFromXMLGrCal"
})
public class WriteLogs {

    protected String searchIn;
    protected String input;
    protected String outputFormat;
    protected List<PairOfDatesXMLGrCal> dateFromXMLGrCal;

    /**
     * Gets the value of the searchIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchIn() {
        return searchIn;
    }

    /**
     * Sets the value of the searchIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchIn(String value) {
        this.searchIn = value;
    }

    /**
     * Gets the value of the input property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInput(String value) {
        this.input = value;
    }

    /**
     * Gets the value of the outputFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputFormat() {
        return outputFormat;
    }

    /**
     * Sets the value of the outputFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputFormat(String value) {
        this.outputFormat = value;
    }

    /**
     * Gets the value of the dateFromXMLGrCal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateFromXMLGrCal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateFromXMLGrCal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PairOfDatesXMLGrCal }
     * 
     * 
     */
    public List<PairOfDatesXMLGrCal> getDateFromXMLGrCal() {
        if (dateFromXMLGrCal == null) {
            dateFromXMLGrCal = new ArrayList<PairOfDatesXMLGrCal>();
        }
        return this.dateFromXMLGrCal;
    }

}
