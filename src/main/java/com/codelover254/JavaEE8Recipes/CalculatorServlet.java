package com.codelover254.JavaEE8Recipes;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calculator", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    /**
     * handler for post request
     * @param request
     * @param response
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        String output = String.format("%d + %d = %d",num1,num2,(num1+num2));
        buildResponse(response.getWriter(),output);
    }

    /**
     * received a printwriter object and a string to write html
     * @param printWriter
     * @param value
     */
    private void buildResponse(PrintWriter printWriter,String value){
        printWriter.println("<html><head><title>");
        printWriter.println("Current Date Servlet");
        printWriter.println("</title></head>");
        printWriter.println("<body><p>");
        printWriter.println(value);
        printWriter.println("</p></body></html>");
    }
}
