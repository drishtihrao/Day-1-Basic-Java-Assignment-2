package com.cg.basic.two;
/*
 * This i a class to search a name in a list of names
 */

import java.util.Scanner;

public class FindName {
	public static void main(String args[]) {
		int i, count = 0;
		// Initializing a string containing a list of names
		String str[] = { "Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev",
				"Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson",
				"Moore", "Taylor", "Anderson", "Thomas", "Jackson" };
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the name you want to search");
		String name = s.nextLine();

		// Checking if the string is present in the list or not
		boolean found = false;
		for (String element : str) {
			if (element.equals(name)) {
				found = true;
				count = count + 1;
			}
		}

		if (found)
			System.out.println("The array contains the string " + name + "," + count + " time");
		else
			System.out.println("The array does not contain the string " + name);
	}

}
