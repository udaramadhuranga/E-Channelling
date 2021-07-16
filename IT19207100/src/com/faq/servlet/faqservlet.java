package com.faq.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utill.PatientDBUtil;

/**
 * Servlet implementation class faqservlet
 */
@WebServlet("/faqservlet")
public class faqservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String ques = request.getParameter("ques");
		String ans = request.getParameter("ans");
		
		boolean isTrue;
		
		try {
			isTrue = PatientDBUtil.insertfaq(ques, ans);
		
		
			RequestDispatcher dis = request.getRequestDispatcher("/viewfaqservlet");
					
					dis.forward(request, response);
		
		}
		 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
