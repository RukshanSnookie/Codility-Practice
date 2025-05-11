package com.task5;

import java.math.BigInteger;

public class Factorial {
	public static void main(String[] args) {

		int number = 66;
		BigInteger result = BigInteger.ONE;

		for (int i = 1; i <= number; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.println(result);
	}
}
