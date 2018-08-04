package com.cg.basic.two;

import java.util.Scanner;

public class ModifySentence {
	public static void main(String args[]) {
		int position, count = 0, flag=0;
		String sentence = new String();

		Scanner scanner = new Scanner(System.in);
		//Taking the sentence and the word to be deleted along with the word's position in the sentence by the user
		System.out.println("Enter a sentence");
		sentence = scanner.nextLine();
		int len = sentence.length();
		
		System.out.println("Word to be deleted: ");
		String wordDelete = scanner.nextLine();
		int wordLen=wordDelete.length();
		
		System.out.println("Word position in the sentence: ");
		position = scanner.nextInt();

		scanner.close();
		
		//Removing all extra spaces
		sentence=sentence.replaceAll("( )+"," ");  
		StringBuffer sent = new StringBuffer(sentence);
		
		//Counting the words in a sentence depending upon the spaces present in the sentence
		for (int i = 0; i < len+1; i++) {
			if (sentence.charAt(i) == ' ')
				count++;
			//Deleting the word given by the user as per it's position
			if (count == position && sent.substring(i+1,i+wordLen+1).equals(wordDelete)) {
				sent.delete(i+1, i+wordLen+2); 
				sentence=sent.toString();
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Word at position "+position+" and word to be deleted do not match");
		
		//Printing the modified sentence
		System.out.println("Modified sentence is ");
		System.out.println(sentence);
	}
}
