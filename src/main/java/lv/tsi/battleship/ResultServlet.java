package lv.tsi.battleship;

import lv.tsi.battleship.model.MyGame;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ResultServlet" , urlPatterns = "/result")
public class ResultServlet extends HttpServlet {
    private MyGame myGame;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (myGame.getUser().isWinner()) {
            response.sendRedirect("/battleship/winner");
        } else {
            doGet(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.getRequestDispatcher("/WEB-INF/pages/result.jsp").include(request, response);
    }
}
