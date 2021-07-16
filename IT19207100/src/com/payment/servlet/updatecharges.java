package com.payment.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utill.PatientDBUtil;

/**
 * Servlet implementation class updatecharges
 */
@WebServlet("/updatecharges")
public class updatecharges extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			
		int id = Integer.parseInt(request.getParameter("id"));
		double hcharge = Double.parseDouble(request.getParameter("hcharge"));
		double dcharge = Double.parseDouble(request.getParameter("dcharge"));
		
		boolean isTrue;
		
		isTrue = PatientDBUtil.updatecharge(id, hcharge, dcharge);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("/viewchargeservlet");
					
					dis.forward(request, response);
		}
		
		}
		catch(Exception e) {
			
			RequestDispatcher dis2 = request.getRequestDispatcher("/mismatch.jsp");
			dis2.forward(request, response);
		}
		
	}

}
