package com.cg.basic.two;

/*
 * Program to check if the input strings are palindrome. If they are, they should be arranged in descending order of no of characters
 */
import java.util.Scanner;

public class FindPalindrome {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String str[] = new String[10];
		String reverse[] = new String[10];
		int loc[] = new int[10];
		int size[] = new int[10];
		int id = 0, temp = 0;

		//taking 10 strings as an input and storing them in an array
		System.out.println("Enter 10 strings ");
		for (int i = 0; i < 10; i++) {
			str[i] = scanner.nextLine();
			
			reverse[i] = "";
			
			//reversing each string and storing them in another array
			for (int j = str[i].length() - 1; j >= 0; j--) {
				reverse[i] = reverse[i] + str[i].charAt(j);
			}
		}
		
		//comparing the input strings with their reverse strings to check if they are palindromes
		for (int i = 0; i < 10; i++) {
			if (str[i].equals(reverse[i])) {
				loc[id] = i;
				id += 1;
			}
		}
		
		
		for (int i = 0; i < id; i++) {
			size[i] = str[loc[i]].length();
		}
		
		//arranging the palindrome strings as per decreasing order of their lengths
		for (int i = 0; i < id; i++) {
			for (int j = 0; j < id - 1; j++) {
				if (size[j] < size[j + 1]) {
					temp = size[j];
					size[j] = size[j + 1];
					size[j + 1] = temp;
					temp = loc[j];
					loc[j] = loc[j + 1];
					loc[j + 1] = temp;
				}
			}
		}

		//printing the sorted palindrome list
		System.out.println("Palindrome Strings are : ");
		for (int i = 0; i < id; i++) {
			System.out.println(str[loc[i]]);
		}
	}
}