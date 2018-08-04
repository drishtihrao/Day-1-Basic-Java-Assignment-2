package com.cg.basic.two;

//Find the missing number given an array of distinct numbers
import java.util.Scanner;

public class FindMissingNumber {
	public static void main(String args[]) {
		int i, j, k = 0, len, swap = 0, minimum;
		int[] array = new int[10];
		minimum = array[0];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		len = scanner.nextInt();

		System.out.println("Enter array elements");
		for (i = 0; i < len; i++)
			array[i] = scanner.nextInt();

		scanner.close();

		// Find the minimum value from the array elements
		for (i = 0; i < len; i++) {
			if (minimum > array[i])
				minimum = array[i];
		}
		// Sort the array in ascending order
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				if (array[j] < array[i]) {
					swap = array[j];
					array[j] = array[i];
					array[i] = swap;
				}
			}
		}

		// New array that includes missing number
		int[] arrCopy = new int[len + 1];
		for (i = 0; i < len; i++) {
			arrCopy[i] = minimum;
			minimum++;
		}

		/*
		 * Compare elements of two arrays If elements are not equal then the
		 * corresponding value in new array is the missing number
		 */
		for (i = 0; i < len; i++) {
			if (array[i] == arrCopy[k]) {
				k++;
				continue;
			} else {
				System.out.println("Missing number is " + arrCopy[k]);
				break;
			}
		}
	}
}