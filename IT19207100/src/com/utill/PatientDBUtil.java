package com.utill;

import java.sql.Connection;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import org.eclipse.jdt.internal.compiler.batch.Main;

import com.model.Appointment;
import com.model.Charges;
import com.model.Faq;
import com.model.Patient;

import java.util.*;



public class PatientDBUtil {

	
	private static Connection con=null;
	private static Statement stnt = null;
	private static ResultSet rs = null;
	private static ResultSet rsk = null;

	

	public static boolean insertpatient(String name , String nic,String gender, String phone, String email,
			String dname,String refno,String date) {
		
		/*
		 * Add payment details to the payment table
		 */
		
		boolean isSuccess = false;
		
		if(dname=="" || refno=="" || date == "") {
			
			return isSuccess;
			
		}
		
		
		try {
			
			con = DBConnect.getConnection();
			stnt = con.createStatement();

String sql ="insert into addapp values (0,'"+name+"' ,'"+nic+"','"+gender+"' ,'"+phone+"' ,'"+email+"' , '"+dname+"' ,'"+refno+"' , '"+date+"' )";
			
			int rs = stnt.executeUpdate(sql);
			
			if(rs >0) {
				isSuccess =true;
			}else {
				isSuccess=false;
			}
			
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}

			return isSuccess;
	}
	
	
	
	public static List<Patient> validate (String name ,String nic,String email){
		
		/*
		 * get perticuler patient
		 */
		
		ArrayList<Patient> cus = new ArrayList<>();
		
		//validate
		try {
			
			con = DBConnect.getConnection();
			stnt = con.createStatement();
			String sql = "select * from addapp where name= '"+name+"' and  nic = '"+nic+"'and  email = '"+email+"'  ";
			rs = stnt.executeQuery(sql);
			
			if(rs.next() ) {
				
				int id = rs.getInt(1);
				String pname = rs.getString(2);
				String nica = rs.getString(3);
				String gender = rs.getString(4);
				String phone = rs.getString(5);
				String pemail = rs.getString(6);
				
				Patient c = new Patient(id,pname , nica,phone,gender,pemail);
				cus.add(c);
				
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;
	}
	
public static List<Appointment> validateap (String dname ,String refNo){
	/*
	 * get booking appointment details
	 */	
	
		ArrayList<Appointment> app = new ArrayList<>();
		
		//validate
		try {
			
			con = DBConnect.getConnection();
			stnt = con.createStatement();
			
			
			
			
			String sql = "select * from appointment where doctername= '"+dname+"' and  refNo = '"+refNo+"'  ";
			rs = stnt.executeQuery(sql);
			
			if(rs.next() ) {
				
				int id = rs.getInt(1);
				String refn = rs.getString(2);
				Date date = rs.getDate(3);
				String doname = rs.getString(4);
				/*int dcharge = rs.getInt(5);*/
			
				String sql2 = "select * from charge ";
				rs = stnt.executeQuery(sql2);
				
				if(rs.next() ) {
					int ida = rs.getInt(1);
					double hcharge = rs.getDouble(2);
					double ddcharge= rs.getDouble(3);
				
				Appointment a = new Appointment(id,refn , date,doname,ddcharge,hcharge);
				app.add(a);
				
				
				}
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return app;
	}
	

	public static boolean validatecredit (int cnum ,int code ,double total,int id,String date){
	
		/*
		 * validate the credit card details
		 */
		boolean isSuccess = false;
		
	
	try {
		
		con = DBConnect.getConnection();
		stnt = con.createStatement();
		String sql = "select * from credit where cardno= '"+cnum+"' and  code = '"+code+"'  ";
		rs = stnt.executeQuery(sql);
		
		if(rs.next() ) {
			
			int cno = rs.getInt(1);
			double amount = rs.getDouble(2);
			int codeno = rs.getInt(3);
			
			
			if((amount-total)>0) {
				/*
				 * update the credit card amount in credit card table
				 */
				
			double blnz = amount-total;
			
			String sql2 = "update credit set amount = '"+blnz+"' where cardno = '"+cnum+"'  ";
			int rs = stnt.executeUpdate(sql2);
			
			LocalDate date2 = LocalDate.now(); 
			
			String sql3 = "insert into payment values (0,'"+id+"','"+total+"','"+date2.toString()+"')  ";
			int rsk = stnt.executeUpdate(sql3);
			
			
				if(rsk >0) {
					isSuccess =true;
				}else {
					isSuccess=false;
				}
				
			}
			
			else if((amount-total)>0){
			
				isSuccess=false;
			}
		
			
		}
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return isSuccess;
}
	
	public static boolean update(int id,String name, String nic,String gender,String phone,String email, String dname, String refno, String date) {
	
		/*
		 * update existing patient details 
		 */
		boolean isSuccess = false;	
		try {
			con = DBConnect.getConnection();
			stnt= con.createStatement();
			
			String sql =  "update addapp set name = '"+name+"' , email = '"+email+"' , phone='"+phone+"' , nic =  '"+nic+"',gender =  '"+gender+"' ,dname =  '"+dname+"'  ,refno =  '"+refno+"' , date =  '"+date+"'   where id = '"+id+"' ";
			
			int rs = stnt.executeUpdate(sql);
			
			if(rs >0) {
				isSuccess =true;
			}else {
				isSuccess=false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		return isSuccess;
		
		
	}
	
/*
 * 
 * 
 * FAQ Handling
 * 
 * 	
 */
	
	public static boolean insertfaq(String ques, String ans) throws SQLException {
		
		/*
		 * Add FAQ for Faq table
		 */
		
		boolean isSuccess = false;
		
		con = DBConnect.getConnection();
		stnt=con.createStatement();
		
		String sql = "insert into faq values (0,'"+ques+"' , '"+ans+"')";
		int rs= stnt.executeUpdate(sql);
		
		
		return isSuccess;
		
	}
	
	
	public static List<Faq> getfaq() throws SQLException {
		/*
		 * get all list of FAQs
		 */
		
		List<Faq> faqa = new ArrayList<>();
		
		con = DBConnect.getConnection();
		stnt=con.createStatement();
		
		String sql = "select * from faq " ;
		ResultSet rs =stnt.executeQuery(sql);
		
		while(rs.next() ) {
			
			int qno = rs.getInt("qno");
			String question = rs.getString("question");
			String answer = rs.getString("answer");
		
			faqa.add ( new Faq(qno, question, answer));
			
			
			
		}
		return faqa;	
	}
	
public static List<Faq> selectfaq (int id ){
		
	/*
	 * get particular Faq from the table
	 */
		ArrayList<Faq> cus = new ArrayList<>();
		
		//validate
		try {
			
			con = DBConnect.getConnection();
			stnt = con.createStatement();
			String sql = "select * from faq where qno= '"+id+"' ";
			rs = stnt.executeQuery(sql);
			
			if(rs.next() ) {
				
				int no = rs.getInt(1);
				String ques = rs.getString(2);
				String ans = rs.getString(3);
			
				
				Faq c = new Faq(no,ques , ans);
				cus.add(c);
				
				
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return cus;	
		
	}
	

public static boolean updatefaq(int id,String ques, String ans) {
	
	/*
	 * update selected faq
	 */
	
	boolean isSuccess = false;	
	try {
		con = DBConnect.getConnection();
		stnt= con.createStatement();
		
		String sql =  "update faq set question = '"+ques+"' , answer = '"+ans+"'   where qno = '"+id+"' ";
		
		int rs = stnt.executeUpdate(sql);
		
		if(rs >0) {
			isSuccess =true;
		}else {
			isSuccess=false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	
	
	return isSuccess;
	
	
}


public static boolean deletefaq(int id) {
	
	/*
	 * delete selected faq
	 */
	boolean isSuccess = false;	
	try {
		con = DBConnect.getConnection();
		stnt= con.createStatement();
		
		String sql =  "delete from  faq   where qno = '"+id+"' ";
		
		int rs = stnt.executeUpdate(sql);
		
		if(rs >0) {
			isSuccess =true;
		}else {
			isSuccess=false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	
	
	return isSuccess;
	
	
}


/*
 * 
 * 
 * Charges Handling
 * 
 * .
 */


public static List<Charges> getcharges() throws SQLException {
	
	/*
	 * get particular charge
	 */
	List<Charges> charge = new ArrayList<>();
	
	con = DBConnect.getConnection();
	stnt=con.createStatement();
	
	String sql = "select * from charge " ;
	ResultSet rs =stnt.executeQuery(sql);
	
	if(rs.next() ) {
		
		int id = rs.getInt(1);
		double hcharge = rs.getDouble(2);
		double dcharge = rs.getDouble(3);
	
		charge.add ( new Charges(id, hcharge, dcharge));
		
		
		
	}
	return charge;	
}



public static List<Charges> selectcharge (int id ){
	/*
	 * select particular charges from the table
	 */
	ArrayList<Charges> cus = new ArrayList<>();
	
	//validate
	try {
		
		con = DBConnect.getConnection();
		stnt = con.createStatement();
		String sql = "select * from charge where id= '"+id+"' ";
		rs = stnt.executeQuery(sql);
		
		if(rs.next() ) {
			
			int ida = rs.getInt(1);
			double hcharge = rs.getDouble(2);
			double dcharge = rs.getDouble(3);
		
			
			Charges c = new Charges(ida,hcharge , dcharge);
			cus.add(c);
			
			
		}
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return cus;	
	
}



public static boolean updatecharge(int id,double hcharge, double dcharge) {
	
	/*
	 * update charges table
	 */
	
	
	boolean isSuccess = false;	
	try {
		con = DBConnect.getConnection();
		stnt= con.createStatement();
		
		String sql =  "update charge set hcharge = '"+hcharge+"' , dcharge = '"+dcharge+"'   where id = '"+id+"' ";
		
		int rs = stnt.executeUpdate(sql);
		
		if(rs >0) {
			isSuccess =true;
		}else {
			isSuccess=false;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
	
	
	return isSuccess;
	
	
}


	
}
