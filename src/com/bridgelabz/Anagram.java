package com.bridgelabz;
	
import java.util.Arrays;
import java.util.Scanner;

//	import com.bridgelabz.utility.AlgorithmUtility;

	public class Anagram {

		public static void main(String[] args) {
			String str1, str2;
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter string 1");
			str1=scanner.next();
			System.out.println("enter string 2");
			str2=scanner.next();
			Anagram data = new Anagram();
			boolean isAnagram=data.isAnagram(str1,str2);
			if(isAnagram) {
				System.out.println("Two String are anagram");
			}else {
				System.out.println("Two String are not anagram");
			}
			scanner.close();
		}
	
	public boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}

}
