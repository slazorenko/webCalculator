package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/calculate")
public class webCalculator extends HttpServlet {
    int i = 0;

    private void calc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double first = Double.parseDouble(request.getParameter("num1"));
        double second = Double.parseDouble(request.getParameter("num2"));
        Double result;
        switch (request.getParameter("operation")) {
            case "plus":
                result = first + second;
                request.setAttribute("result", "Result: " + result);
                request.setAttribute("history", first + " + " + second + " = " + result);
                break;
            case "minus":
                result = first - second;
                request.setAttribute("result", "Result: " + result);
                request.setAttribute("history", first + " - " + second + " = " + result);
                break;
            case "multiply":
                result = first * second;
                request.setAttribute("result", "Result: " + result);
                request.setAttribute("history", first + " * " + second + " = " + result);
                break;
            case "divide":
                result = first / second;
                request.setAttribute("result", "Result: " + result);
                request.setAttribute("history", first + " / " + second + " = " + result);
                break;
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        calc(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        calc(request, response);
    }
}
