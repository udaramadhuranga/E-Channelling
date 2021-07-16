package com.oop.model;

public class viewDetails {
	
	private String nic;
	private String name;
	private String email;
	private String message;
	
	public viewDetails(String nic, String name, String email, String message) {
		this.nic = nic;
		this.name = name;
		this.email = email;
		this.message = message;
	}

	public String getNic() {
		return nic;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMessage() {
		return message;
	}

}
