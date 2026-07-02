package com.pojo;

public class FoodItem {
	private String name;
	private double price;
	private String category;
	
	public FoodItem(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category=category;
	}
	
	//getter
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	
	//setter
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setCategory(String category) {
		this.category=category;
	}
}
