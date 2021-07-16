package com.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.viewDetails;

public class customerDButil {
	
	private static boolean success;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static boolean insertcustomer(String nic,String name,String email,String message) {
	
	boolean success = false;
	
	try {
		
		con = DBconnectionutil.getConnection();
		stmt = con.createStatement();
		String sql ="insert into customer values('"+nic+"','"+name+"','"+email+"','"+message+"')";
		int rs = stmt.executeUpdate(sql);
		
		if(rs > 0) {
			success = true;
		} 
		else {
			success = false;
		}
		
	}
	catch(Exception e) {
		
		e.printStackTrace();
	}
	
	return success;
	}
	
	public static List<viewDetails> validate(String nic){
		
		ArrayList<viewDetails> cus = new ArrayList<>();
		
		try{
			
			con = DBconnectionutil.getConnection();
			stmt = con.createStatement();
			String sql ="select * from customer where nic ='"+nic+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				
				String nicn = rs.getString(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String message = rs.getString(4);
				
				viewDetails vd = new viewDetails(nicn, name, email, message);
				cus.add(vd);
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return cus;
	}
	
	public static boolean updatemessage(String nic,String name,String email,String message) {
		
		try {
			
			con = DBconnectionutil.getConnection();
			stmt = con.createStatement();
			String sql = "update customer set name='"+name+"', email='"+email+"' , message='"+message+"'" + "where nic='"+nic+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				success = true;
			} 
			else {
				success = false;
			}
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return success;
	}
	
	public static List<viewDetails> messageDetails(String nic){
		
		ArrayList<viewDetails> cus = new ArrayList<>();
		
		try{
			
			con = DBconnectionutil.getConnection();
			stmt = con.createStatement();
			String sql ="select * from customer where nic ='"+nic+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){
				
				String nicn = rs.getString(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String message = rs.getString(4);
				
				viewDetails vd = new viewDetails(nicn, name, email, message);
				cus.add(vd);
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return cus;
	}
	
	public static boolean deletemessage(String nic,String name,String email,String message){
		
		try{
			
			con = DBconnectionutil.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer where nic='"+nic+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				success = true;
			} 
			else {
				success = false;
			}
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return success;
	}
	
	
	public static List<viewDetails> getMessageDetails() throws SQLException {
		
		ArrayList<viewDetails> cus = new ArrayList<>();
			con = DBconnectionutil.getConnection();
			stmt = con.createStatement();
			String sql ="select * from customer";
			rs = stmt.executeQuery(sql);
			
				
			while(rs.next()){
						
				String nic = rs.getString("nic");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String message = rs.getString("message");
						
				cus.add(new viewDetails(nic, name, email, message));
			}
			
		return cus;
	}
	
public static boolean adminDelete(String nic){
		
		try{
			
			con = DBconnectionutil.getConnection();
			stmt = con.createStatement();
			String sql = "delete from customer where nic='"+nic+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				success = true;
			} 
			else {
				success = false;
			}
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		
		return success;
	}
}












