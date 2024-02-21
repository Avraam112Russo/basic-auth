package com.l4cky_russ1ano.webxmlexample;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Enumeration<String> contextParams = getServletContext().getInitParameterNames();
        while (contextParams.hasMoreElements()){
            String paramName = contextParams.nextElement();
            System.out.println(paramName +" : "+ getServletContext().getInitParameter(paramName));
        }
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}