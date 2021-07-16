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
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

    private static Connection con = null;
   	private static Statement statement =null;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String name = request.getParameter("search"); //catching searching word from search option in header2.jsp
		
		
		
	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		try
		{
		response.setContentType("text/html");
		 con = DBConnect.getConnection();
		 
		 PreparedStatement ps =con.prepareStatement("select * from doctor where name ='"+name+"' or speciality = '"+name+"'"); //sql query rrgarding search
		 ResultSet result =ps.executeQuery();
		 PrintWriter out = response.getWriter();
		 
		 //html code start from here......
		 //display results to the user from a table
		 
		        out.println("<html> " );
		 		out.println("<body><h2>  Search Result </h2>"
		 				
		 				+ "<div class='divs'><table border = '1' class = 'stable' cellspacing = '0' cellpadding = '10' width='75%'> <tr > <th>  name  </th>   <th>  room  </th> <th>  speciality  </th><th> charge </th><th>time </th> <th> day </th><th>  make appoinment </th> </tr>  ");
		 
		 
			while(result.next())
			{
				
				out.println("<tr><td>"+ result.getString(2) +  "</td>  <td>"+ result.getString(5) +  "</td>  <td>"+ result.getString(6) +  "</td> <td>"+ result.getString(7) + "</td> <td> "+result.getString(8)+"</td><td> "+result.getString(9)+"</td>");
				
				out.println("<td><form method  = 'POST' action = '#'> <input type = 'submit' value = make_appoinment > </form></td> <tr>");
						
				//this submit allow user to make appoinments. But appoinment fuction is doing by other member.
				//because of that # is used here 
			}
			
			out.println("</table></div> <jsp:include page='/footer.jsp/></jsp:include> </body> </html>");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
