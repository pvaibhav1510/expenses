package com.expenses.app.servlets.signin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.batch.Main;

@WebServlet(description = "Signin action", urlPatterns = { "/SigninAction" })
public class SigninAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		PrintWriter out = resp.getWriter();
		out.print("Email: " + email + ", Password: " + password);

		HttpSession sessioon = req.getSession();
		// sessioon.setAttribute("expenses_id", );
		// create session
		// redirect to dashboard servlet

		
		resp.sendRedirect("/DashboardAction");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

}
