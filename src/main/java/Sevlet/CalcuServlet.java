package Sevlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import Model.Calculator;

@WebServlet(name = "Sevlet.CalcuServlet", value = "/Calcu")
public class CalcuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float num1 = Integer.parseInt(request.getParameter("Num1"));
        float num2 = Integer.parseInt(request.getParameter("Num2"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1>Result:</h1>");
        try{
            float result = Calculator.calculate(num1,num2,operator);
            pw.println(num1 + " " + operator + " " + num2 + " = " +result);
        } catch (Exception exception){
            pw.println("ERR: " + exception.getMessage());
        }
        pw.println("<html>");
    }
}
