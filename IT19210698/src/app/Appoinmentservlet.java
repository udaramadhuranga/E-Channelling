package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Appoinmentservlet")
public class Appoinmentservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String pname = request.getParameter("pname");
		String page = request.getParameter("page");
		String pphone = request.getParameter("pphone");
		String paddress = request.getParameter("paddress");
		String date = request.getParameter("date");
		String dname = request.getParameter("dname");
		String spec = request.getParameter("spec");
		
		boolean isTrue;
		
		isTrue = AppoinmentDButil.insertPatient(pname, page, pphone, paddress, spec, dname, date);
		
		if(isTrue == true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("sucess.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
			
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("unsucess.jsp");
			dispatcher2.forward(request, response);
		}
		
		
	}

}
