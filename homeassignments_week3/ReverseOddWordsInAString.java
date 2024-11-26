package week3.homeassignments_week3;

public class ReverseOddWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			
		}
		for (int i = 0; i < charArray.length; i++) {
		         if (i % 2 != 0) { // Check if the index is odd
		             System.out.print(charArray[i]);
		             
		         }
		}
	}
}

