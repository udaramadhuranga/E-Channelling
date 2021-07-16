package echanelling;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class doctorinfoServlet
 */
@WebServlet("/doctorinfoServlet")
public class doctorinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public doctorinfoServlet() {
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
		
		//getting user request from doctorinfo submit
		  
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try
		{
		response.setContentType("text/html");
		 con = DBConnect.getConnection();
		 
		 PreparedStatement ps =con.prepareStatement("select * from doctor"); //query to get all the data of all the rows in doctor table
		 
		 ResultSet result =ps.executeQuery(); //using executeQuery because of just only retrving data
		 PrintWriter out = response.getWriter();
		 
		 //display respone in the servlet page without forwarding to another jsp file
		 
		 
		 //html codes starts from here....
		 
		        out.println("<html> <body> " + 
		 		" <h2 align = \"center\" >Manage Doctors  </h2><div class='info'><table border = '1'  class = 'stable' cellspacing = '0' cellpadding = '10' width='75%'> <tr><th>  Id  </th> <th>  name  </th> <th>  phoneNo  </th> <th>  email  </th> <th>  room  </th> <th>  speciality  </th><th> charge </th><th>time </th> <th> day </th><th>  delete </th>  <th> update </th></tr>  ");
		 
		 
		 
			while(result.next()) //from the loop geting and displaying all rows according to sql query
			{
				
				out.println("<tr><td>" +result.getString(1)+  "</td><td>"+ result.getString(2) +  "</td> <td>"+ result.getString(3) + "</td> <td>"+ result.getString(4) + "</td> <td>"+ result.getString(5) +  "</td>  <td>"+ result.getString(6) +  "</td> <td>"+ result.getString(7) + "</td> <td> "+result.getString(8)+"</td><td> "+result.getString(9)+"</td>");
						
								//delete for admin to delete doctor details
								out.println( " <td>  <form method = 'POST'  action = 'deletedodctor' > <input type ='hidden' name ='did' value = '"+result.getString(1) +"'> <input type = 'submit'  value = 'delete'> </form>  </td> ");
								//getting doctor id as hidden type to delete the related doctor details only only
								
								
								//update for admin to update doctor details
								out.println ("<td>  <form method ='POST' action = 'updateDoctorDetails'> <input type = hidden name ='id' value = '"+ result.getString(1)+ "' ><input type = 'submit'  value = 'update'</form></td> </tr>");
								//getting doctor id as hidden type to delete the related doctor details only only
			}
			
			out.println("</table></div> </body> </html>");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
	}

	


