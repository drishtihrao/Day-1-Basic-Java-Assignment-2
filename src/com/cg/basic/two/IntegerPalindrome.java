package com.cg.basic.two;

import java.util.Scanner;
/*
 * This is a program to check if the entered number is a palindrome or not
 */
public class IntegerPalindrome {
	public static void main(String args[]) {
		int num, rem, a, sum = 0;
		Scanner s = new Scanner(System.in);
		
		//taking a number from the user
		System.out.println("Enter a number");
		num = s.nextInt();
		a = num;
		
		//checking if the number is palindrome or not
		while (num > 0) {
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		
		//printing the results accordingly
		if (sum == a)
			System.out.println("The entered number " + a + " is a palindrome");
		else
			System.out.println("The entered number " + a + " is not a palindrome");

	}
}
