package com.bookstore.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.service.UserServices;

@WebServlet("/admin/create_user")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String email= request.getParameter("email");
	String fullName= request.getParameter("fullName");
	String password= request.getParameter("password");
	
	
	response.getWriter().println("Email: "+ email);
	response.getWriter().println("Full Name: "+ fullName);
	response.getWriter().println("Password: "+ password);
	
	
	
	UserServices userServices= new UserServices();
	userServices.createUser(email,fullName,password);
	}

}
