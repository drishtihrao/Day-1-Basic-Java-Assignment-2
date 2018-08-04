package com.cg.basic.two;
/*
 * This is a class to search a number in a two dimensional array
 */

import java.util.*;

class SearchMultDimArray {
	public static void main(String args[]) {
		MultDArray A = new MultDArray();
		A.find();
	}
}

class MultDArray {
	//Initiating a two dimensional array
	int a[][] = new int[15][15]; 
	int F, i, j, k = 0;
	Scanner scanner = new Scanner(System.in);

	//creating a multi dimensional array as per user
	public MultDArray() {
		System.out.println("Enter the number of rows and columns");
		int rows = scanner.nextInt();
		int columns = scanner.nextInt();

		
		System.out.println("Enter the elements of the array");
		for (i = 0; i < rows; i++) {
			for (j = 0; j < columns; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter the number you want to search");
		F = scanner.nextInt();
	}

	// method to search an array
	public void find() {
		for (i = 0; i < 15; i++) {
			for (j = 0; j < 15; j++) {
				if (a[i][j] == F) {
					System.out.println("Number is present in the array at position " + i + "," + j);
					k = k + 1;
				}
			}
		}

		if (k == 0)
			System.out.println("Entered number not present");
	}
}
