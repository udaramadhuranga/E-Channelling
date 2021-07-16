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


@WebServlet("/viewservlet")
public class viewservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nic = request.getParameter("nic");
		try{
			List<viewDetails> details =customerDButil.validate(nic);
			request.setAttribute("details", details);
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
			
		RequestDispatcher dis = request.getRequestDispatcher("viewDetails.jsp");
		dis.forward(request, response);

	}

}
