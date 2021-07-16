package echanelling;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class savedocupdate
 */
@WebServlet("/savedocupdate")
public class savedocupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public savedocupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("mname");
		String id = request.getParameter("id");
		String Speciality =request.getParameter("speciality");
		String Email =request.getParameter("Email");
		String phonenumber =request.getParameter("phone");
		String room = request.getParameter("room");
		
		String charge = request.getParameter("charge");
		String time = request.getParameter("time");
		String day = request.getParameter("day");
		
		//catching user inputs by the input type name 
		
		boolean istrue; //variable to assign boolean value which is given by updatedoctor method in doctor class

		istrue = doctor.updatedoctor(id, name, Speciality, Email, phonenumber, room,charge,time,day);

		if(istrue  ==true)
		{
			RequestDispatcher dis1 =request.getRequestDispatcher("sucess.jsp"); //if variable value true respons forward to sucess.jsp
			dis1.forward(request, response);
		}
		
		
		
		else
		{
			RequestDispatcher dis2 =request.getRequestDispatcher("Unsucess.jsp");//if variable value false respons forward to unsucess.jsp
			dis2.forward(request, response);
		}
		
	}

}
