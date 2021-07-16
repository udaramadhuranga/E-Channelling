package com.model;

import java.util.Date;

public class Appointment {

	private int apoid;
	private String refNo;
	private Date date;
	private String dname;
	private double dcharge;
	private double hcharge;
	
	/*Parameterlized constructer
	 * 
	 * */
	public Appointment(int apoid, String refNo, Date date, String dname, double dcharge, double hcharge) {
	
		this.apoid = apoid;
		this.refNo = refNo;
		this.date = date;
		this.dname = dname;
		this.dcharge = dcharge;
		this.hcharge = hcharge;
	}
	
	
	/*
	 * getters
	 */
	
	public int getApoid() {
		return apoid;
	}
	public String getRefNo() {
		return refNo;
	}
	public Date getDate() {
		return date;
	}
	public String getDname() {
		return dname;
	}
	public double getDcharge() {
		return dcharge;
	}
	public double getHcharge() {
		return hcharge;
	}
	
	
	
	
}
