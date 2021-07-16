package com.model;

public class Credit {

	
	private int cnum;
	private int code;
	private double amount;
	
	/*
	 * Parameterlized constructer
	 * 
	 * */
	
	public Credit(int cnum, int code, double amount) {
	
		this.cnum = cnum;
		this.code = code;
		this.amount = amount;
	}

	/*
	 * getters
	 * 
	 */
	public int getCnum() {
		return cnum;
	}

	public int getCode() {
		return code;
	}

	public double getAmount() {
		return amount;
	}
	
	
}
