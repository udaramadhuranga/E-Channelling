package echanelling;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class deletedodctor
 */
@WebServlet("/deletedodctor")
public class deletedodctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletedodctor() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("did");//getting id from doctorinfo servlet delete submit
		
		
		boolean istrue;

		
		istrue = doctor.deletedoctor(id);//variable to assign boolean value which is given by deletedoctor method in doctor class

		if(istrue  ==true)
		{
			RequestDispatcher dis1 =request.getRequestDispatcher("sucess.jsp");//if variable value true respons forward to sucess.jsp
			dis1.forward(request, response);
		}
		
		
		
		else
		{
			RequestDispatcher dis2 =request.getRequestDispatcher("Unsucess.jsp"); //if variable value false respons forward to unsucess.jsp
			dis2.forward(request, response);
		}
		
		}
		

		
	}


