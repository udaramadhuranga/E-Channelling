<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "java.sql.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



</head>
<body>

 <jsp:include page="Appoinmentinfoheader.jsp"></jsp:include>

<%
         
               String url = "jdbc:mysql://localhost:3306/e-channelling";
               String user = "root"; 
               String password = "1234";
		
            Connection con = null;
            PreparedStatement ps = null;
            
            try
            {
            	Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(url,user,password);
                String sql = "select * from appoinment;";
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
          %>  
          
          <table> <thead class="thead-dark"><tr><th>  Appointment Id  </th> <th>  Patient Name  </th> <th>  phone No  </th> <th>  Address  </th> <th> Speciality  </th> <th>  Doctor  </th><th> Date </th><th> Age </th><th>  Delete </th></tr></thead>
          <%
          
              while(rs.next()){
              
               int aid = rs.getInt(1);
               String pname = rs.getString(2);
               String phone = rs.getString(3);
               String address = rs.getString(4);
               String speciality = rs.getString(5);
               String doctor = rs.getString(6);
               String date = rs.getString(7);
               String age = rs.getString(8);
          
          
          %>
          <tr><td><%= aid%></td><td><%= pname %></td><td><%= phone %></td><td><%= address %></td><td><%= speciality %></td><td><%= doctor %></td><td><%= date%></td><td><%= age %></td><td><form method = "post" action="delete"><input type = "hidden" name="aid" value="<%= aid%>"><input type = "submit" name = "delete" value = "Delete" action = "delete"></form></td></tr> 
           
           <% 
              }
          %>
            </table>
          <%
            }
            catch(Exception e){
            	
            	e.printStackTrace();
            }
           %>


      
  





<jsp:include page="footer.jsp"></jsp:include>
				 	

</body>
</html>