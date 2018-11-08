package lv.tsi.battleship;

import lv.tsi.battleship.model.MyGame;
import lv.tsi.battleship.model.User;

import javax.inject.Inject;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "RegistrationServlet", urlPatterns = "/registration" )
public class RegistrationServlet extends javax.servlet.http.HttpServlet {

    @Inject
    private MyGame myGame;

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String un = request.getParameter("username");
        User user = new User();
        user.setName(un);
        myGame.setUser(user);
        response.sendRedirect("/battleship/waitregistration");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/registration.jsp") .include(request,response);
    }
}
