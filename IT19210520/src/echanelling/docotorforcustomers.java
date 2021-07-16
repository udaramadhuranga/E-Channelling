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
 * Servlet implementation class docotorforcustomers
 */
@WebServlet("/docotorforcustomers")
public class docotorforcustomers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public docotorforcustomers() {
        super();
        // TODO Auto-generated constructor stub
    }

    private static Connection con = null;
	private static Statement statement =null;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try
		{
		response.setContentType("text/html");
		 con = DBConnect.getConnection();
		 
		 PreparedStatement ps =con.prepareStatement("select * from doctor");
		 ResultSet result =ps.executeQuery();
		 PrintWriter out = response.getWriter();
		 
		 
		 
		 //html codes start from here...

		 out.println("<html>  <body> ");
			
		 
		 
		 
		 out.println("<h1 class='h1' align = \"center\" >Choose Your Doctor !!</h1><br/>");
		 
		 while(result.next())
			{
				 
				
				
			 
			
			 
		 out.println("<div class='divd'>");

		 out.println("Name <br/><lable>"+ result.getString(2) +"</lable><br/>" );
		 out.println("room <br/><lable>"+ result.getString(5) +"</lable><br/>" );
		 out.println("Speciality <br/><lable>"+ result.getString(6) +"</lable><br/>" );
		 out.println("charge <br/><lable>"+ result.getString(7) +"</lable><br/>" );
		 out.println("Time <br/><lable>"+ result.getString(8) +"</lable><br/>" );
		 out.println("Day <br/><lable>"+ result.getString(9) +"</lable><br/>" );
		 
			out.println("<form method  = 'POST' action = '#'> <input type = 'submit' value = make_appoinment  class= 'appoinment'> </form> ");
			
		 out.println("</div>"); 
		 
		 out.println("</br/></br/>"); 
		 
		 
			}
		 
			
			out.println("</body> </html>");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	}



