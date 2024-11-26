package week3.homeassignments_week3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray = test.toCharArray();
		{
		

		    for (int i = 0; i < charArray.length; i++) {
		         if (i % 2 != 0) { // Check if the index is odd
		             charArray[i] = Character.toUpperCase(charArray[i]);
		         }
		     }

		     String result = new String(charArray);
		     System.out.println(result); 
		 } 
		}
		}
