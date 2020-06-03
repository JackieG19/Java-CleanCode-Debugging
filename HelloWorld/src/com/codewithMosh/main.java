package com.codewithMosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class main {
	public static void main (String[] args){
		
		int principal = 0;
		byte years = 0;
		float annualInterest = 0;
		float monthyInterest = 0;
		int numberOfPayment = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("Principle: ");
			principal = scanner.nextInt();
			if(principal >= 1000 && principal <= 1_000_000);
				break;
			System.out.println("Enter a value between 1000 and 1,000,000");
		}
		
		while(true){
			System.out.print("Annual Interest Rate: ");
			annualInterest = scanner.nextFloat();
			if(annualInterest >= 1 && annualInterest <= 30);
				break;
			System.out.println("Enter a value between 1 and 30");
		}
		
		while(true){
			System.out.print("Period (Years): ");
			years = scanner.nextByte();
			if(years >= 1 && years <= 30);
				break;
			System.out.println("Enter a value between 1 and 30");
		}
		
		double mortgage = calculateMortgage(principal, annualInterest, years);
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance();
		System.out.println("Mortgage: "+ mortgageFormatted);
	}
	
	public static double calulateMortage(int principal, float annualInterest, byte years) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		short numberOfPayment = (short)(years * MONTHS_IN_YEAR);
		
		double mortgage = principal
				* (monthlyInterest * Math.pow(1 + monthlyInterest, mortgage))
				/ (Math.pow(1 + monthlyInterest, numberOfPayment))
		return mortgage;
	}
}
