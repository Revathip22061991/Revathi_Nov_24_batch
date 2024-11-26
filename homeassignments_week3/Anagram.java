package week3.homeassignments_week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1="stop";
		String text2="pots";
		//Check if the lengths of the two strings are equal
		int length1 = text1.length();
		int length2 = text2.length();
		
		if(length1==length2) {
			System.out.println("Continue for Anagram");
		}
		else {
			System.out.println("Lengths mismatch");
		}
		//text1 to character array
		char[] charArray1 = text1.toCharArray();
		for (int i = 0; i < charArray1.length; i++) {	
			System.out.print(charArray1[i]);
		}
		System.out.println("\n");
		Arrays.sort(charArray1);
		System.out.println(charArray1);
		
		//text2 to character array
		char[] charArray2 = text2.toCharArray();
		for (int i = 0; i < charArray2.length; i++) {			
		System.out.print(charArray2[i]);			
		}
		System.out.println("\n");
		Arrays.sort(charArray2);
	    System.out.println(charArray2);
		//Check if the sorted arrays are equal
		
		if(charArray1.equals(charArray2)) {
		System.out.println("The given strings are Anagram.");
		}
		else {
		System.out.println("The given strings are not an Anagram.");
		}
	}
}

	

