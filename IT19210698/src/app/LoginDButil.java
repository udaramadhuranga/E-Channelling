package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LoginDButil {

	
	
	
	public static List<Admin> loginvalidate(String username , String password){
		
		
		       ArrayList<Admin> admin = new ArrayList<>();
		
		       String url = "jdbc:mysql://localhost:3306/e-channelling";
			   String user = "root";
			   String pass = "1234";
				
			   try {
				   
				   Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url,user,pass);
					Statement stmt = con.createStatement();
					 
					String sql = "select * from admin where username = '"+username+"' and password = '"+password+"'"; 
				   
					ResultSet rs = stmt.executeQuery(sql);
					
					if(rs.next()) {
						
						String uname = rs.getString(1);
						String upassword = rs.getString(2);
						
						Admin ad = new Admin(uname , upassword);
						
						admin.add(ad);
					}
					
					
					
				   
			   }
			   
			   catch(Exception e) {
				   e.printStackTrace();
			   }
		
		
		
		return admin;
		
	}
	
	
	
	
}
