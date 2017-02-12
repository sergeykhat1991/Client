package ru.khat.logreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.khat.logreader.types.InputData;
import ru.khat.logreader.utils.Journal;
import ru.khat.logreader.ws.OutputData;
import ru.khat.logreader.ws.PairOfDatesXMLGrCal;
import ru.khat.logreader.ws.TestSoap;
import ru.khat.logreader.ws.TestWSService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/logReader")
public class LogReaderController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    protected OutputData doPost(HttpServletRequest request) throws ServletException, IOException {

        String searchIn = request.getParameter("searchIn");
        String input = request.getParameter("input");
        String outputFormat = request.getParameter("outputFormat");
        String[] datesFrom = request.getParameterValues("dateFrom");
        String[] datesTo = request.getParameterValues("dateTo");
        new Journal().writeEvent(request, searchIn + ", search for: " + input + ", fileFormat: " + outputFormat);

        OutputData outputData = null;
        if (input != null) {

            TestWSService testWSService = new TestWSService();
            TestSoap port = testWSService.getTestSoapPort();

            List<PairOfDatesXMLGrCal> dates = new ArrayList<>();
            for (int i = 0; i < datesFrom.length; i++) {
                PairOfDatesXMLGrCal pair = new PairOfDatesXMLGrCal();
                pair.setFrom(datesFrom[i]);
                pair.setTo(datesTo[i]);
                dates.add(pair);
            }

            try {
                outputData = port.writeLogs(searchIn, input, outputFormat, dates);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //   request.setAttribute("filename", outputData.getUrlFile());
            //    response.setContentType("application/json");
            //   response.getWriter().write(new ObjectMapper().writeValueAsString(outputData));

        }
        return outputData;
    }
}