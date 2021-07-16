package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AdminupdateDButil {

	
	public static boolean updateadmin(String newuname , String newpassword)
	{
		boolean isSuccess = false;
		
		String url = "jdbc:mysql://localhost:3306/e-channelling";
		String user = "root";
		String pass = "1234";
		
		try {
               Class.forName("com.mysql.cj.jdbc.Driver");
			
			   Connection con = DriverManager.getConnection(url,user,pass);
			   Statement stmt = con.createStatement();
			   
			   String sql = " update admin set password = '"+newpassword+"' where username = '"+newuname+"'";
			
			   int rs = stmt.executeUpdate(sql);
			   
			   if(rs > 0) {
				   isSuccess = true;
				   
			   }else {
				   
				   isSuccess = false;
			   }
			   
			   
			   
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSuccess;
		
	}
	
	
}
