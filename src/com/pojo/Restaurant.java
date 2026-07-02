package com.pojo;

public class Restaurant {
	private String name;
	private int rating;
	private String address;
	
	public Restaurant(String name, int rating, String address) {
		this.name=name;
		this.rating = rating;
		this.address = address;
	}
	
	//getter
	
	public String getName() {
		return name;
	}
	public int getRating() {
		return rating;
	}
	public String getAddress() {
		return address;
	}
	
	//setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRating(int rating) {
		this.rating=rating;
	}
	public void setAddress(String address) {
		this.address=address;
	}
}
