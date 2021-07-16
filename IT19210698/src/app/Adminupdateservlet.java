package app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Adminupdateservlet
 */
@WebServlet("/Adminupdateservlet")
public class Adminupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminupdateservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String newuname = request.getParameter("uname");
		String newpassword = request.getParameter("password");
		
		
		boolean istrue;
		
		istrue = AdminupdateDButil.updateadmin(newuname, newpassword);
		
      if(istrue == true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("updatesucess.jsp");
			dispatcher.forward(request, response);
			
		}
		else {
			
			RequestDispatcher dispatcher2 = request.getRequestDispatcher("updateunsucess.jsp");
			dispatcher2.forward(request, response);
		}
		
		
		
		
	}

}
