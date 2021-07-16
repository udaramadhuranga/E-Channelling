package com.faq.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utill.PatientDBUtil;

/**
 * Servlet implementation class updatefaqservlet
 */
@WebServlet("/updatefaqservlet")
public class updatefaqservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		int id = Integer.parseInt(request.getParameter("qno"));
		String ques  = request.getParameter("ques");
		String ans  = request.getParameter("ans");
		
	
		boolean isTrue;
		
		isTrue = PatientDBUtil.updatefaq(id, ques, ans);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("/viewfaqservlet");
					
					dis.forward(request, response);
		}
	}

}
