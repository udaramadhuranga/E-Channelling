package com.oop.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.util.customerDButil;


@WebServlet("/contactUsServlet")
public class contactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nic = request.getParameter("nic");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		boolean isTrue ;
		
		isTrue = customerDButil.insertcustomer(nic, name, email, message);
		
		if(isTrue == true) {
			
			RequestDispatcher dis1 = request.getRequestDispatcher("successContactUs.jsp");
			dis1.forward(request, response);
		}	
		else {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("UnsuccessContactUs.jsp");
			dis2.forward(request, response);
		} 
		
	}

}
