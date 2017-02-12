package ru.khat.logreader.types;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "inputData")
public class InputData {

    private String searchIn;
    private String input;
    private String outputFormat;
    private String[] dateFrom;
    private String[] dateTo;

    public InputData() {

    }

    public String getSearchIn() {
        return searchIn;
    }

    public void setSearchIn(String searchIn) {
        this.searchIn = searchIn;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(String outputFormat) {
        this.outputFormat = outputFormat;
    }


    public String[] getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String[] dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String[] getDateTo() {
        return dateTo;
    }

    public void setDateTo(String[] dateTo) {
        this.dateTo = dateTo;
    }
}
