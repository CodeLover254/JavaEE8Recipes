package com.codelover254.JavaEE8Recipes;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(name = "CurrentDate", value = "/current-date")
public class CurrentDateTimeServlet extends HttpServlet {
    private LocalDateTime current=LocalDateTime.now();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //you can set headers as required.
        response.addHeader("Content-Type","text/html");
        PrintWriter printWriter = response.getWriter();
        //synchronize to ensure only one request changes the property at a time
        //servlets are multithreaded
        synchronized (current){
            current = LocalDateTime.now();
        }
        printWriter.println("<html><head><title>");
        printWriter.println("Current Date Servlet");
        printWriter.println("</title></head>");
        printWriter.println("<body><p>");
        printWriter.println(String.format("The current date and time is: %s",current.toLocalDate().toString()));
        printWriter.println("</p></body></html>");
    }
}
