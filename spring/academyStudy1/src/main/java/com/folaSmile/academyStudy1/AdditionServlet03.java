package com.folaSmile.academyStudy1;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdditionServlet03", value = "/AdditionServlet03")
public class AdditionServlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int num1 = 20;
        int num2 = 10;
        int add = num1 + num2 ;

        request.setAttribute("num1", num1);
        request.setAttribute("num2", num2);
        request.setAttribute("add", add);



        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/unit01/add04.jsp");
//        RequestDispatcher dispatcher = request.getRequestDispatcher("add04out.jsp");

        dispatcher.forward(request, response);

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
