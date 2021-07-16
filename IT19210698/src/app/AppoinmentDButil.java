package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AppoinmentDButil {

	
	public static boolean insertPatient(String pname , String page , String pphone , String paddress , String spec , String dname , String date)
	{
		boolean isSucess = false;
		
		String url = "jdbc:mysql://localhost:3306/e-channelling";
		String user = "root";
		String password = "1234";
		
		try {
               Class.forName("com.mysql.cj.jdbc.Driver");
			
			   Connection con = DriverManager.getConnection(url,user,password);
			   Statement stmt = con.createStatement();
			   
			   String sql = "insert into appoinment values(0 ,'"+pname+"','"+pphone+"','"+paddress+"','"+spec+"','"+dname+"','"+date+"','"+page+"')";
			
			   int rs = stmt.executeUpdate(sql);
			   
			   if(rs > 0) {
				   isSucess = true;
				   
			   }else {
				   
				   isSucess = false;
			   }
			   
			   
			   
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSucess;
		
	}
	
	
	public static boolean deleteAppointment(String aid)
	{
		boolean isSucess = false;
		
		String url = "jdbc:mysql://localhost:3306/e-channelling";
		String user = "root";
		String password = "1234";
		
		try {
               Class.forName("com.mysql.cj.jdbc.Driver");
			
			   Connection con = DriverManager.getConnection(url,user,password);
			   Statement stmt = con.createStatement();
			   
			   String sql = "delete from appoinment where aid='"+aid+"'";
			
			   int rs = stmt.executeUpdate(sql);
			   
			   if(rs > 0) {
				   isSucess = true;
				   
			   }else {
				   
				   isSucess = false;
			   }
			   
			   
			   
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return isSucess;
		
	}
	
	
	
}






