package echanelling;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateDoctorDetails
 */
@WebServlet("/updateDoctorDetails")
public class updateDoctorDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateDoctorDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private static Connection con = null;
   	private static Statement statement =null;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		
		try
		{
		response.setContentType("text/html");
		 con = DBConnect.getConnection();
		 
		 PreparedStatement ps =con.prepareStatement("select * from doctor where did = '"+id +"'");
		 ResultSet result =ps.executeQuery();
		 PrintWriter out = response.getWriter();
		 
		 
		 
			while(result.next())
			{
				out.println("<html><body>");
				
				out.println("<form method = 'POST' action = 'savedocupdate' > ");
				
					out.println("<input type = hidden name ='id' value = '"+ result.getString(1)+ "'>  ");
					out.println("Name <br/>");
					out.println("<input type = 'text' name ='mname' value = '"+result.getString(2) +" '> <br/>");
					out.println("<br/>");
					
					out.println("phone number <br/>");
					out.println("<input type = 'text' name ='phone' value = '"+result.getString(3) +"'> <br/>");
					out.println("Email <br/>");
					out.println("<input type = 'text' name ='Email' value = '"+result.getString(4) +"'><br/>");
					out.println("room No<br/>");
					out.println("<input type = 'text' name ='room' value = '"+result.getString(5) +"'><br/>");
					out.println("Speciality <br/>");
					out.println("<input type = 'text' name ='speciality' value = '"+result.getString(6) +"'><br/>");
					
					out.println("charge <br/>");
					out.println("<input type = 'text' name ='charge' value = '"+result.getString(7) +"'><br/>");
					
					out.println("Time <br/>");
					out.println("<input type = 'text' name ='time' value = '"+result.getString(8) +"'><br/>");
					
					out.println("Day <br/>");
					out.println("<input type = 'text' name ='day' value = '"+result.getString(9) +"'><br/>");
					
					out.println	( "<input type = 'submit' value = save ></form>");
			}
			
			out.println(" </body> </html>");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
