package com.faq.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utill.PatientDBUtil;


@WebServlet("/deletefaq")
public class deletefaq extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println(id);
			
			
	
			boolean isTrue;
			
			isTrue = PatientDBUtil.deletefaq(id);
			
			if(isTrue == true) {
				RequestDispatcher dis = request.getRequestDispatcher("/viewfaqservlet");
						
						dis.forward(request, response);
			}
			
			
	}

}
