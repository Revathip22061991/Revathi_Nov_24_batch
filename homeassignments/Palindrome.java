package week1.homeassignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 554455, output = 0, remainder;
	
		int input = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      output = output * 10 + remainder;
	      num /= 10;
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (input == output) {
	      System.out.println(input + " is Palindrome.");
	    }
	    else {
	      System.out.println(input + " is not Palindrome.");
	    }
	  }
	}