package com.folaSmile.academyStudy1.servletUnit01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet(value="/경로") 만 잘 지정해 두면 패키지 않으로 모아도 문제없이 작동한다.
@WebServlet(name = "AdditionServlet01", value = "/AdditionServlet01")
public class AdditionServlet01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int num1 = 20;
        int num2 = 10;
        int add = num1 + num2;
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Addition in package</title><head>");
        out.println("<body>");
        out.println(num1 + "+" + num2 + "=" + add);
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
