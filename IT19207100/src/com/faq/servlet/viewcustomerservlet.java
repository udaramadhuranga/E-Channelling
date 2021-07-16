package com.faq.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Faq;
import com.utill.PatientDBUtil;

/**
 * Servlet implementation class viewcustomerservlet
 */
@WebServlet("/viewcustomerservlet")
public class viewcustomerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {  
			
			List<Faq>faqdetails =PatientDBUtil.getfaq();
			request.setAttribute("faqdetails", faqdetails);
			

			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			
			RequestDispatcher  dis2 = request.getRequestDispatcher("/faqcustomerview.jsp");
			dis2.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
