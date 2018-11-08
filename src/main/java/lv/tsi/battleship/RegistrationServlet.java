package lv.tsi.battleship;

import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "RegistrationServlet", urlPatterns = "/registration" )
public class RegistrationServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String un = request.getParameter("username");
        System.out.println(un);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/registration.jsp") .include(request,response);
    }
}
