package com.task3;

public class ReverseInteger {
//	int number ;
	
	public int numberReverse(int number) {
		int lastDigit;
		int reversedNum = 0;
		
		while (number !=0) {
			lastDigit = number % 10; // using % to get last digit
			System.out.println(lastDigit);
			reversedNum = (reversedNum*10)+ lastDigit ; // storing last digit in the variable
			number = number / 10;
		}
		
		
		return reversedNum;
	}
}
