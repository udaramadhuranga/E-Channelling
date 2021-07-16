package com.model;

import java.util.ArrayList;



public class Patient {

	private int id;
	private String name;
	private String nic;
	private String phone;
	private String gender;
	private String email;
	
	
	/*
	 * Parameterlized constructer
	 * */
	
	
	public Patient(int id, String name, String nic, String phone, String gender, String email) {
	
		this.id = id;
		this.name = name;
		this.nic = nic;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
	}
	
	/*
	 * getters
	 */

	public int getId() {
		return id;
	}

	/*
	 * setters
	 */
	public String getName() {
		return name;
	}

	public String getNic() {
		return nic;
	}

	public String getPhone() {
		return phone;
	}

	public String getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}
	

	/*
	 * collection of getEmployee details
	 * */
	public ArrayList<Patient> getEmployees(){
		
		
		return null;
		
		
	}
}
