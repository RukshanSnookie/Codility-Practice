package com.task3;

public class ReverseInteger {
	int number ;
	
	public int numberReverse() {
		int lastDigit;
		int reversedNum = 0;
		
		while (number !=0) {
			lastDigit = number % 10; // using % to get last digit
			reversedNum = (reversedNum*10)+ lastDigit ; // storing last digit in the variable
		}
		
		
		return reversedNum;
	}
}
