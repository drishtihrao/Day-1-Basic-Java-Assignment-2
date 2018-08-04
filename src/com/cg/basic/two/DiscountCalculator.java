package com.cg.basic.two;
/*
 * This is a class to calculate 35% discount on each product
 */
import java.util.Scanner;

public class DiscountCalculator {
	public static void main(String args[]) {
		int originalPrice;
		double newItemPrice;
		
		//Taking the original price of the product as an input from the user
		System.out.println("Enter the original price");
		Scanner scanner = new Scanner(System.in);
		originalPrice = scanner.nextInt();
		
		System.out.println("The original price is " + originalPrice);
		
		//Calculating the discount price and printing it
		System.out.println("The discount amount is " + 0.35 * originalPrice);
		
		//Calculating the discounted price of product and printing it
		newItemPrice = originalPrice - (0.35 * originalPrice);
		System.out.println("The new price for the item is " + newItemPrice);
	}
}
