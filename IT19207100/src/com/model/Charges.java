package com.model;

public class Charges {

	private int id;
	private double hcharge;
	private double dcharge;
	
	/*
	 * Parameterlized constructer
	 * */
	public Charges(int id, double hcharge, double dcharge) {
		super();
		this.id = id;
		this.hcharge = hcharge;
		this.dcharge = dcharge;
	}
	
	/*
	 * getters
	 */
	public int getId() {
		return id;
	}
	public double getHcharge() {
		return hcharge;
	}
	public double getDcharge() {
		return dcharge;
	}
	
	
	
	
}
