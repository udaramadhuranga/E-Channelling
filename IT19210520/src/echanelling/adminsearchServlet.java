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
 * Servlet implementation class adminsearchServlet
 */
@WebServlet("/adminsearchServlet")
public class adminsearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminsearchServlet() {
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
		 
		//catching searching word from search option in adminheader.jsp
			String name = request.getParameter("search");

		 
		 PreparedStatement ps =con.prepareStatement("select * from doctor where did ='"+name+"' or name = '"+name+"' "); //query to select rows from doctor table which are related to search  word
		 ResultSet result =ps.executeQuery();
		 PrintWriter out = response.getWriter();
		 
		 
		 
		 //html code start here...
		 		   out.println("<html><body> " + 
		 		" <h2 >Search Result  </h2><div class ='info'><table> <tr><th>  Id  </th> <th>  name  </th> <th>  phoneNo  </th> <th>  email  </th> <th>  room  </th> <th>  speciality  </th><th> charge </th><th>time </th> <th> day </th><th>  delete </th>  <th> update </th></tr>  ");
		 
		 
		 
		 
		 
			while(result.next())//loop to get and display nedded data from the related rows
			{
				
				                out.println("<tr><td>" +result.getString(1)+  "</td><td>"+ result.getString(2) +  "</td> <td>"+ result.getString(3) + "</td> <td>"+ result.getString(4) + "</td> <td>"+ result.getString(5) +  "</td>  <td>"+ result.getString(6) +  "</td> <td>"+ result.getString(7) + "</td> <td> "+result.getString(8)+"</td><td> "+result.getString(9)+"</td>");
						
								out.println( " <td>  <form method = 'POST'  action = 'deletedodctor' > <input type ='hidden' name ='did' value = '"+result.getString(1) +"'> <input type = 'submit'  value = 'delete'> </form>  </td> ");
								out.println ("<td>  <form method ='POST' action = 'updateDoctorDetails'> <input type = hidden name ='id' value = '"+ result.getString(1)+ "' ><input type = 'submit'  value = 'update'</form></td> </tr>");
			}
			
			out.println("</table></div> </body> </html>");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		
}
