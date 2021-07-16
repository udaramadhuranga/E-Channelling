package app;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Loginservlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                
		
		   String username = request.getParameter("uname");
		   String password = request.getParameter("password");
		   
		   
		   try {
			   
			       List<Admin> admininfo = LoginDButil.loginvalidate(username, password);
			       request.setAttribute("admininfo", admininfo);
			   
		   }
		   
		   catch(Exception e) {
			   
			   e.printStackTrace();
		   }
		   
		   RequestDispatcher dis =  request.getRequestDispatcher("/Admininfo.jsp");
		   dis.forward(request, response);
		   
	}

}
