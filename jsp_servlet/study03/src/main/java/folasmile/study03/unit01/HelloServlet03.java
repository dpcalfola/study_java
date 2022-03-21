package folasmile.study03.unit01;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet03", value = "/HelloServlet03")
public class HelloServlet03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
//        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.print("<html><body><h1>");
        out.print("Hello Servlet 헬로우 서블릿");
        out.print("</h1><body><html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
