package com.task2;

public class NumberSwapping {

	public static void main(String[] args) {

		int a = 25;
		int b = 16;
		
		// using a temp variable to swap
		int temp = a;
		
		a = b;
		b = temp;
		System.out.println(a + " and " + b);
		
		
		// a = 1  and b = 25
		// using mathematical operators to swap
		a = a + b; // 16+25 = 41
		b = a - b; // 41-25 = 16
		a = a - b; // 41-16 = 25
		
		System.out.println(a + " and " + b);
		
	}

}
