package ru.khat.logreader.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.9
 * 2016-12-22T13:16:43.114+03:00
 * Generated source version: 3.1.9
 * 
 */
@WebService(targetNamespace = "http://ws.logreader.khat.ru/", name = "TestSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TestSoap {

    @WebMethod
    @Action(input = "http://ws.logreader.khat.ru/TestSoap/writeLogsRequest", output = "http://ws.logreader.khat.ru/TestSoap/writeLogsResponse")
    @RequestWrapper(localName = "writeLogs", targetNamespace = "http://ws.logreader.khat.ru/", className = "ru.khat.logreader.ws.WriteLogs")
    @ResponseWrapper(localName = "writeLogsResponse", targetNamespace = "http://ws.logreader.khat.ru/", className = "ru.khat.logreader.ws.WriteLogsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public ru.khat.logreader.ws.OutputData writeLogs(
        @WebParam(name = "searchIn", targetNamespace = "")
        java.lang.String searchIn,
        @WebParam(name = "input", targetNamespace = "")
        java.lang.String input,
        @WebParam(name = "outputFormat", targetNamespace = "")
        java.lang.String outputFormat,
        @WebParam(name = "dateFromXMLGrCal", targetNamespace = "")
        java.util.List<ru.khat.logreader.ws.PairOfDatesXMLGrCal> dateFromXMLGrCal
    );
}
