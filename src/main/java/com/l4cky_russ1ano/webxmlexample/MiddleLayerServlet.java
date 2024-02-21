package com.l4cky_russ1ano.webxmlexample;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "MiddleLayerServlet", value = "/MiddleLayerServlet")
public class MiddleLayerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");

        Map<String, Double> map = new HashMap<>();
        map.put("Russo", 12.500);
        map.put("Masha", 16.500);

        request.getSession().setAttribute("employees", map);
        request.setAttribute("listOfStrings", strings);
        request.getRequestDispatcher("/demo.jsp").forward(request, response);
    }
}
