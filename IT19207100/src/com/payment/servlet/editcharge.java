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
 * Servlet implementation class editcharge
 */
@WebServlet("/editcharge")
public class editcharge extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		
		
		List<Charges> chdet =PatientDBUtil.selectcharge(id);
		request.setAttribute("chdet", chdet);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher  dis = request.getRequestDispatcher("updatecharge.jsp");
		dis.forward(request, response);
	}

}
