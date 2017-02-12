package ru.khat.logreader.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;


@Controller
@RequestMapping("/download")
public class DownloadController {

    @RequestMapping(method = RequestMethod.GET)
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        String filename = request.getParameter("filename");
        response.setContentType("text/plain");
        response.setHeader("Content-Disposition",
                "attachment;filename=" + filename);

        InputStream is = new URL("http://192.168.0.171:7001/out/" + filename).openStream();

        int read;
        byte[] bytes = new byte[4096];
        OutputStream os = response.getOutputStream();

        while ((read = is.read(bytes)) != -1) {
            os.write(bytes, 0, read);
        }
        os.flush();
        os.close();

    }
}
