package com.bridgelabz;

/**********************************************************
 * Implimentation of Sorting Method Bubble sort
 * 
 * @author Sanyukta Nirmal
 * @Version 1.1
 * @since 16-06-2021
 *
 **********************************************************/

public class BubbleSort {
	/**
	 * array taken for sorting
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 6, 12, 7, 43, 21, 16 };
		bubbleSort(arr);
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	/**
	 * sorting technique
	 * 
	 * @param arr
	 */
	private static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
