package model;

public class User {
	private String fname;
	private String lname;
	private int adminPermission;
	private String username;
	private String password;
	
	public User(String firstname, String lastname, String username, String password){
		this.fname = firstname;
		this.lname = lastname;
		this.username = username;
		this.password = password;
		
		this.adminPermission = 0;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAdminPermission() {
		return adminPermission;
	}
	public void setAdminPermission(int adminPermission) {
		this.adminPermission = adminPermission;
	}
	
	
}
