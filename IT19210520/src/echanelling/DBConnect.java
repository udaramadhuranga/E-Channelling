package echanelling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	private static String url ="jdbc:mysql://localhost:3306/oop?useSSL=false";
	private static  String username = "root";
	private static String password = "12345";
	private static Connection con;
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection(url,username,password);
			
		} 
		
		catch (Exception e) {
		
			e.printStackTrace();
			System.out.println("database connection is not sucessfull");
		}
		
		return con;
		
	}

	
}
