package week3.homeassignments_week3;

import java.util.Scanner;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println("Sentence before removing the duplicate words:"+text);
		String result="";
	    String[] allWords = text.split(" ");
	    
		for (int i = 0; i < allWords.length; i++) {
			
			for (int j = i+1; j < allWords.length; j++) {
				
				if(allWords[i].equals(allWords[j]))
					
				allWords[j] = "java";
			}
		}


        for (String word : allWords) {
            if (!word.equals("java")) {
                result = result+ word + " ";
                
            }
        }
		
		System.out.println("\nSentence after removing duplicate words: "+result);

	
}
}


