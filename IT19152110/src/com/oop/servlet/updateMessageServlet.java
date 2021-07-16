package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.viewDetails;
import com.oop.util.customerDButil;

@WebServlet("/updateMessageServlet")
public class updateMessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nic = request.getParameter("nic");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		boolean isTrue;
		
		isTrue = customerDButil.updatemessage(nic, name, email, message);
		
		if(isTrue == true) {
			
			List<viewDetails> details = customerDButil.messageDetails(nic);
			request.setAttribute("details", details);
			
			RequestDispatcher dis1 = request.getRequestDispatcher("viewDetails.jsp");
			dis1.forward(request, response);
		}	
		else {
			
			RequestDispatcher dis1 = request.getRequestDispatcher("unsuccessUpdate.jsp");
			dis1.forward(request, response);
		}
		
	}

}
