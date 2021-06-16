package com.bridgelabz;

/**********************************************************
 * Implementation of Sorting Method Insertion sort by words
 * 
 * @author Sanyukta Nirmal
 * @Version 1.1
 * @since 16-06-2021
 *
 **********************************************************/

public class InsertionSort {
	/**
	 * Function to print the sorted array of string according to length.
	 * @param s string
	 * @param n
	 */
	static void sort(String[] s, int n) 
	{
		for (int i = 1; i < n; i++) 
		{
			String temp = s[i];
			int j = i - 1;
			while (j >= 0 && temp.length() < s[j].length()) 
			{
				s[j + 1] = s[j];
				j--;
			}
			s[j + 1] = temp;
		}
	}

	/**
	 * print the sorted array of string
	 * 
	 * @param str
	 * @param n
	 */
	static void printArraystring(String str[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(str[i] + " ");
	}

	public static void main(String args[]) 
	{
		String[] arr = { "Apple", "Bananna", "Peach", "Orange" };
		int n = arr.length;

		/**
		 * Function to perform sorting
		 */
		sort(arr, n);
		/**
		 * Calling the function to print result
		 */
		printArraystring(arr, n);

	}
}
