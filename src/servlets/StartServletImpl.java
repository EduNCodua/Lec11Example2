package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 20.12.2016.
 */
@WebServlet(name = "StartServlet", urlPatterns = "/")
public class StartServletImpl extends HttpServlet {

    protected void run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            out.print("<HTML>" +
                    "<BODY>" +
                    "Hello world!!!!! " +
                    "<p> <img src=\"image\"> " +
                    "</BODY></HTML>");
        }
        finally {
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        run(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        run(request, response);
    }
}
