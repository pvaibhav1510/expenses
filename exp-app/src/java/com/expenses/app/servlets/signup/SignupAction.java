package com.expenses.app.servlets.signup;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.expenses.app.models.User;
import com.expenses.app.validators.SignupHelper;

/**
 * Servlet implementation class SignupAction
 */
@WebServlet("/SignupAction")
public class SignupAction extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String passHash = SignupHelper.valodateNEncryptPassword(req);
        User user = new User().name(req.getParameter("name"))//
                .email(req.getParameter("email"))//
                .mobile(req.getParameter("mobile"))//
                .passHash(passHash);

        SignupHelper.validateUser(user);
        // Signup action sends mail
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        service(req, resp);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        service(req, resp);
    }

}
