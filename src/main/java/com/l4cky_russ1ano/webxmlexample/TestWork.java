package com.l4cky_russ1ano.webxmlexample;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


public class TestWork extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> initParams = getServletConfig().getInitParameterNames();
        while (initParams.hasMoreElements()){
            String name = initParams.nextElement();
            System.out.println(name + " : " + getServletConfig().getInitParameter(name));
        }
        System.out.println("================");
        Enumeration<String> contextParams = getServletContext().getInitParameterNames();
        while (contextParams.hasMoreElements()){
            String paramName = contextParams.nextElement();
            System.out.println(paramName +" : "+ getServletContext().getInitParameter(paramName));
        }


        resp.getWriter().write("<html>" +
                "<body><div>" +
                "work" +
                "</div></body>" +
                "</html>");
    }
}
