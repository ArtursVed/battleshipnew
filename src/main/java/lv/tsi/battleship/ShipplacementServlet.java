package lv.tsi.battleship;

import lv.tsi.battleship.model.CellState;
import lv.tsi.battleship.model.ErrorHolder;
import lv.tsi.battleship.model.MyGame;
import lv.tsi.battleship.model.TempShipsHolder;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShipplacementServlet",  urlPatterns = "/shipplacement")
public class ShipplacementServlet extends HttpServlet {
    @Inject
    private ErrorHolder errorHolder;
    @Inject
    private TempShipsHolder ships;
    @Inject
    private MyGame myGame;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] cells = request.getParameterValues("cell");

        if (cells != null) {
            for (String addr : cells) {
                ships.addShip(addr);

            }
        }

        if (cells == null || cells.length != 3) {
            errorHolder.setMessage("Please correct placement");
            request.getRequestDispatcher("/WEB-INF/pages/shipplacement.jsp").include(request, response);
            return;
        }

        for (String addr : cells) {
            myGame.getUser()
                    .getMyField()
                    .setState(addr, CellState.SHIP);


        }
        myGame.getUser().setReady(true);
        response.sendRedirect("/battleship/waitplacement");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/shipplacement.jsp") .include(request,response);
    }
}
