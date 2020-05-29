package com.codewithMosh;

public class main {
	public static void main (String[] args){
		greetUser("Jackie");
		greetUser("Jenny");
		
		greetUser("John", "Smith");
	}
	
	public static void greetUser(String name) {
		System.out.println("Hello " + name);
	}

	public static void greetUser(String firstName, String lastName) {
		System.out.println("Hello " + firstName + " " + lastName);
	}
}