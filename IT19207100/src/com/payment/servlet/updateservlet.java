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
 * Servlet implementation class updateservlet
 */
@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name  = request.getParameter("name");
		String nic  = request.getParameter("nic");
		String gender  = request.getParameter("gender");
		String phone  = request.getParameter("phone");
		String email  = request.getParameter("email");
		String dname = request.getParameter("dname");
		String refno = request.getParameter("refno");
		String date = request.getParameter("date");
		

		
		boolean isTrue;
		
		isTrue = PatientDBUtil.update(id ,name, nic, gender, phone, email,dname,refno,date);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("/SetAppoinmentServlet");
					
					dis.forward(request, response);
		}else  {
			RequestDispatcher dis2 = request.getRequestDispatcher("/unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
