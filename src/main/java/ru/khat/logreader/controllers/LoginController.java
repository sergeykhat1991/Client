package ru.khat.logreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.khat.logreader.utils.Journal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Controller
@RequestMapping("/")
public class LoginController {


    @RequestMapping(value = "/error", method = RequestMethod.POST)
    protected String doError(HttpServletRequest request) throws ServletException, IOException {

        if (request.getHeader("Referer") != null) {
            new Journal().writeEvent(request, "logon attempt");
        }

        //  response.sendRedirect("login.jsp");
        return "redirect:/login.jsp";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected String doSuccess(HttpServletRequest request) throws ServletException, IOException {

        if (request.getHeader("Referer") != null) {
            new Journal().writeEvent(request, "logon");
        }

        return "redirect:/index2.jsp";
    }

}
