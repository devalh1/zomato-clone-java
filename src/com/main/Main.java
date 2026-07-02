package com.main;

import com.pojo.*;

public class Main {
	public static void main(String args []) {
		
		User user = new User("Devalh","9876543210","Pune");
		Restaurant restaurant = new Restaurant("Green Things", 4, "Pune");
		FoodItem foodItem1 = new FoodItem("Panner Butter Masala", 250.0, "Main Course");
		FoodItem foodItem2 = new FoodItem("Butter Garlic Naan", 70.0, "Roti/Bread");
	}
}
