package com.cg.basic.two;
/*
 * This is a program to reverse all the words in the sentence
 */
import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		int i;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String line = s.nextLine();
		
		//the entered sentence is split and stored in an array
		String strcopy[] = line.split(" ");
		
		int len = strcopy.length;
		
		//each word in the array is individually reversed and the whole sentence is printed
		for (i = 0; i < len; i++) {
			StringBuffer sc = new StringBuffer(strcopy[i]);
			System.out.print(sc.reverse() + " ");
		}

	}
}
