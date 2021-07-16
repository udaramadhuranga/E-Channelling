package com.payment.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Appointment;
import com.model.Patient;
import com.utill.PatientDBUtil;



@WebServlet("/SetAppoinmentServlet")
public class SetAppoinmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nic  = request.getParameter("nic");
		String name  = request.getParameter("name");
		String email  = request.getParameter("email");
		String dname = request.getParameter("dname");
		String refNo = request.getParameter("refno");

		request.setAttribute("dname", dname);
		
		
		
		try {  
			List<Patient>custdetails =PatientDBUtil.validate(name,nic,email);
			request.setAttribute("custdetails", custdetails);
			
			List<Appointment>apdetails =PatientDBUtil.validateap(dname, refNo);
			request.setAttribute("apdetails", apdetails);
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			RequestDispatcher  dis = request.getRequestDispatcher("PaymentProfile.jsp");
			dis.forward(request, response);
			
	}

}
