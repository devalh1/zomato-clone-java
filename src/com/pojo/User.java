package com.pojo;

public class User {
	private String name;
	private String phoneNumber;
	private String email;
	
	public User(String name,String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email=email;
	}
	
	//getter
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	
	//setter
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public void setEmail(String email) {
		this.email=email;
	}
}
