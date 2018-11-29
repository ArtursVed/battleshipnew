package lv.tsi.battleship;

import lv.tsi.battleship.model.MyGame;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GamesServlet", urlPatterns = "/games")
public class GamesServlet extends HttpServlet  {

    @Inject

    private MyGame myGame;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String addr = request.getParameter("cell");
    if (!myGame.isMyTurn()) {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST);
        return;
    }
    myGame.getGame().fire(addr);
    doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

     request.getRequestDispatcher("/WEB-INF/pages/games.jsp").include(request,response);
    }
}
