package lv.tsi.battleship;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GamesServlet", urlPatterns = "/games")
public class GamesServlet extends HttpServlet  {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       System.out.println("Hello");

        PrintWriter out = response.getWriter();
        out.println("hellouuuu");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Hello");

        PrintWriter out = response.getWriter();
        out.println("hellouuuu");
        out.close();
    }
}
