package com.payment.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utill.PatientDBUtil;


@WebServlet("/PayServlet")
public class PayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
		int cnumber = Integer.parseInt(request.getParameter("cnum"));
		int code = Integer.parseInt(request.getParameter("code"));
		double total = Double.parseDouble(request.getParameter("total"));
		int id = Integer.parseInt(request.getParameter("id"));
		String date = request.getParameter("date");
		
		
		boolean isTrue;
		
		
		isTrue=	PatientDBUtil.validatecredit(cnumber, code,total,id,date);

			
		
			if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("/success.jsp");
						
						dis.forward(request, response);
			}else {
				RequestDispatcher dis2 = request.getRequestDispatcher("/unsuccess.jsp");
				dis2.forward(request, response);
			}
		}
	
		catch(NumberFormatException e){
			
			RequestDispatcher dis2 = request.getRequestDispatcher("/mismatch.jsp");
			dis2.forward(request, response);
			
		}
		
		
	}

}
