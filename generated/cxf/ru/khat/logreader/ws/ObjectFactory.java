
package ru.khat.logreader.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.khat.logreader.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WriteLogs_QNAME = new QName("http://ws.logreader.khat.ru/", "writeLogs");
    private final static QName _WriteLogsResponse_QNAME = new QName("http://ws.logreader.khat.ru/", "writeLogsResponse");
    private final static QName _OutputData_QNAME = new QName("http://ws.logreader.khat.ru/", "outputData");
    private final static QName _Block_QNAME = new QName("http://ws.logreader.khat.ru/", "block");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.khat.logreader.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WriteLogs }
     * 
     */
    public WriteLogs createWriteLogs() {
        return new WriteLogs();
    }

    /**
     * Create an instance of {@link WriteLogsResponse }
     * 
     */
    public WriteLogsResponse createWriteLogsResponse() {
        return new WriteLogsResponse();
    }

    /**
     * Create an instance of {@link OutputData }
     * 
     */
    public OutputData createOutputData() {
        return new OutputData();
    }

    /**
     * Create an instance of {@link Block }
     * 
     */
    public Block createBlock() {
        return new Block();
    }

    /**
     * Create an instance of {@link PairOfDatesXMLGrCal }
     * 
     */
    public PairOfDatesXMLGrCal createPairOfDatesXMLGrCal() {
        return new PairOfDatesXMLGrCal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteLogs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logreader.khat.ru/", name = "writeLogs")
    public JAXBElement<WriteLogs> createWriteLogs(WriteLogs value) {
        return new JAXBElement<WriteLogs>(_WriteLogs_QNAME, WriteLogs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WriteLogsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logreader.khat.ru/", name = "writeLogsResponse")
    public JAXBElement<WriteLogsResponse> createWriteLogsResponse(WriteLogsResponse value) {
        return new JAXBElement<WriteLogsResponse>(_WriteLogsResponse_QNAME, WriteLogsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutputData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logreader.khat.ru/", name = "outputData")
    public JAXBElement<OutputData> createOutputData(OutputData value) {
        return new JAXBElement<OutputData>(_OutputData_QNAME, OutputData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Block }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.logreader.khat.ru/", name = "block")
    public JAXBElement<Block> createBlock(Block value) {
        return new JAXBElement<Block>(_Block_QNAME, Block.class, null, value);
    }

}
