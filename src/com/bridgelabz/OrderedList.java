package com.bridgelabz;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Comparator;
	import java.util.Iterator;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.Scanner;

	public class OrderedList {
		private List<Integer> numberList = new LinkedList<>();
		
		/**
		 *  To read file from file path and store the numbers in a linked list
		 */
		private List<Integer> readFile() throws FileNotFoundException {
			File file = new File("e:/BridgeLabz/Algorithmas/src/com/bridgelabz/Number.txt");
			Scanner scan = new Scanner(file);
			while (scan.hasNextLine()) {
				numberList.add(scan.nextInt());
			}
			scan.close();
			return numberList;
		}
		
		/**
		 * @return the number user wants to search
		 */
		private int takeUserInput() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number to search  ");
			return sc.nextInt();
		}
		
		/**
		 * Sorts the linked list
		 */
		private void sortNumbers() {
			numberList.sort(Comparator.naturalOrder());
		}
		
		/**
		 * Removes the element if 
		 *  same as key
		 * otherwise puts it in correct sorted position 
		 * @param key (user input which user wants to search)
		 */
		private void editLinkedList(int key) {
			if (numberList.contains(key)) {
				numberList.remove(key);
			} else {
				int i;
				//To put key in correct sorted position
				for( i=0;i<numberList.size();i++) {
					if(numberList.get(i) > key)
						break;
				}
				numberList.add(i,key);
			}
		}
		
		/**
		 * Writes number list to the text file
		 * @throws IOException
		 */
		private void writeFile() throws IOException {
			FileWriter writer = new FileWriter("e:/BridgeLabz/Algorithmas/src/com/bridgelabz/NumberOut.txt");
			Iterator<Integer> itr = numberList.iterator();
			int i = 0;			while (itr.hasNext() && i < numberList.size()) {
				writer.write(numberList.get(i));
				i++;
			}
			writer.close();
			System.out.println("File write successful");

		}
		
		/**
		 * Prints the linked list on console
		 */
		private void printList() {
			System.out.println(numberList);
		}
		
		public static void main(String[] args) throws IOException {
			OrderedList numbers = new OrderedList();
			numbers.readFile();
			numbers.sortNumbers();
			int key = numbers.takeUserInput();
			numbers.editLinkedList(key);
			numbers.printList();
			numbers.writeFile();
		}

	}

