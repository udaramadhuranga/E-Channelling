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


@WebServlet("/editfaq")
public class editfaq extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public editfaq() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		
		
		List<Faq>faqde =PatientDBUtil.selectfaq(id);
		request.setAttribute("faqde", faqde);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher  dis = request.getRequestDispatcher("updatefaq.jsp");
		dis.forward(request, response);
		
	
	}

}
