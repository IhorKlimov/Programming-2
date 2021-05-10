package com.example.p2_lab_02_web_2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/secondTask")
public class SecondTask extends HttpServlet {


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
            double result2 = calculate2(Double.parseDouble(paramA), Double.parseDouble(paramB), Double.parseDouble(paramC), Double.parseDouble(paramD));
            out.println("<h2>" + result2 + "</h2>");
        } catch (NumberFormatException e) {
            out.println("<h2>Error</h2>");
        }
        out.println("</body></html>");
    }
    public void destroy() {
    }
    public static double calculate2(double a, double b, double c, double d) {
        double var2 = 9 * (Math.asin(a)) / Math.cos(Math.sqrt(Math.abs(b)) + Math.pow(2.43, d) + Math.log10(c));
        return var2;
    }
}