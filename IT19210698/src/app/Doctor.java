package app;

public class Doctor {

	private int did;
	private String name;
	private String spec;
	private int appoinmentsPday;
	private String phone;
	private String email;
	private int room;
	private String day;
	
	public Doctor(int did, String name, String spec, int appoinmentsPday, String phone, String email, int room,
			String day) {
		
		this.did = did;
		this.name = name;
		this.spec = spec;
		this.appoinmentsPday = appoinmentsPday;
		this.phone = phone;
		this.email = email;
		this.room = room;
		this.day = day;
	}

	public int getDid() {
		return did;
	}

	
	public String getName() {
		return name;
	}

	
	public String getSpec() {
		return spec;
	}

	
	public int getAppoinmentsPday() {
		return appoinmentsPday;
	}

	

	public String getPhone() {
		return phone;
	}

	

	public String getEmail() {
		return email;
	}


	public int getRoom() {
		return room;
	}

	
	public String getDay() {
		return day;
	}

	
}
