package com.task6;

public class LengthOfLastString {

	
	
	public static void main(String[] args) {
		String phrase = "   This is a phrase   ";
		int count = 0;
		char [] listOfLetters = phrase.trim().toCharArray();
		
		System.out.println(listOfLetters);
		
		for(int i=listOfLetters.length-1; i >= 0; i--) {
			if (listOfLetters[i] != ' ') {
				count += 1;
			}
			else {
				if (count > 0) {
					System.out.println(count);
					break;
				}
			}
		}
		
	}
}
