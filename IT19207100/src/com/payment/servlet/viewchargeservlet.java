package com.payment.servlet;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Charges;
import com.utill.PatientDBUtil;

/**
 * Servlet implementation class viewchargeservlet
 */
@WebServlet("/viewchargeservlet")
public class viewchargeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {  
			
			List<Charges>chdetails =PatientDBUtil.getcharges();
			request.setAttribute("chdetails", chdetails);
			

			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher  dis = request.getRequestDispatcher("/viewcharge.jsp");
			dis.forward(request, response);
			
		
		
	}
		
		
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

try {  
			
			List<Charges>chdetails =PatientDBUtil.getcharges();
			request.setAttribute("chdetails", chdetails);
			

			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher  dis = request.getRequestDispatcher("/viewcharge.jsp");
			dis.forward(request, response);
			
		
		
	}

}
