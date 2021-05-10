package com.example.programming2.lab2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/thirdTask")
public class ThirdTask extends HttpServlet {


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
            double result3 = calculate3(Double.parseDouble(paramA), Double.parseDouble(paramB), Double.parseDouble(paramC), Double.parseDouble(paramD));
            out.println("<h2>" + result3 + "</h2>");
        } catch (NumberFormatException e) {
            out.println("<h2>Error</h2>");
        }
        out.println("</body></html>");
    }

    public void destroy() {
    }

    public static double calculate3(double a, double b, double c, double d) {
        double var3 = (3 * a) / (Math.cos(a)) * (Math.sqrt(Math.tanh(Math.abs(b) * c) / Math.log10(d)));
        return var3;
    }
}