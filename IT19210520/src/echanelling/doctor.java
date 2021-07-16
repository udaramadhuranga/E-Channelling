package echanelling;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class doctor {

	private static Connection con = null;
	private static Statement statement =null;

//method which use to insert a doctorr tp doctor table
public static boolean insertdoctor(String id,String name,String speciality,String Email,String phone,String room,String charge,String time,String day )
{
	
	boolean addsucess =false; 
	

	 con = DBConnect.getConnection();
	 
	 try { 
	
	 statement = con.createStatement();

	 String sql = "insert into doctor( did,name,phoneNo,Email,room,speciality,charge,timeperiod,day) values('"+id+"','"+name+"','"+phone+"','"+Email +"','"+room+"','"+speciality+"','"+charge+"','"+time+"','"+day+"')";
	 
	
	 
	int result =statement.executeUpdate(sql); //statment return either 0 or 1 
	
	
	if(result >0)
	{
		addsucess =true;
	}

	else
	{
		addsucess = false;
	}
	 
	 
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
	return addsucess; //return to get the value for isTrue variable
}




public static boolean deletedoctor(String id) //method which used to delete a doctor
{
	
	boolean deletesucess =false;
	

	 con = DBConnect.getConnection();
	 
	 try { 
	
	 statement = con.createStatement();

	 String sql = ("delete from doctor where did = '"+id+"'"); 
	 
	int result =statement.executeUpdate(sql);
	
	
	if(result >0)
	{
		deletesucess =true;
	}

	else
	{
		deletesucess = false;
	}
	 
	 
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
	return deletesucess;
}



//method which used to update doctor detals
public static boolean updatedoctor(String id,String name,String speciality,String Email,String phone,String room,String charge,String time,String day )
{
	
	boolean updatesucess =false;
	

	 con = DBConnect.getConnection();
	 
	 try { 
	
	 statement = con.createStatement();

	 String sql = ("update  doctor  set name = '"+name+"',phoneNo = '"+ phone+"',Email = '"+Email +"',room = '"+room +"',speciality = '"+ speciality+"',charge = '"+charge +"',timeperiod = '"+time+"',day = '"+day+"'   where did = '"+id +"' ");
	 
	int result =statement.executeUpdate(sql);
	
	
	if(result >0)
	{
		updatesucess =true;
	}

	else
	{
		updatesucess = false;
	}
	 
	 
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	
	
	return updatesucess;
}
}









