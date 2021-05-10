package com.example.programming2.lab2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstTask")
public class FirstTask extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String paramA = request.getParameter("paramA");
        String paramB = request.getParameter("paramB");
        String paramC = request.getParameter("paramC");
        String paramD = request.getParameter("paramD");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Result: </h1>");
        try {
            double result1 = calculate1(Double.parseDouble(paramA), Double.parseDouble(paramB), Double.parseDouble(paramC), Double.parseDouble(paramD));
            out.println("<h2>" + result1 + "</h2>");
        } catch (NumberFormatException e) {
            out.println("<h2>Error</h2>");
        }
        out.println("</body></html>");
    }
    public void destroy() {
    }
    public static double calculate1(double a, double b, double c, double d) {
        double var1 = (Math.exp(a) + Math.log(c)) / (Math.sqrt(Math.pow(b, c))) * Math.abs(Math.atan(d));
        return var1;
    }
}