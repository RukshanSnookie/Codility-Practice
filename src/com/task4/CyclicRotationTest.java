package com.task4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void testSolution() {
		int [] input = {6,5,4,3,2};
		int [] expected = {2,6,5,4,3};
		CyclicRotation testCase1 = new CyclicRotation();
		assertArrayEquals(expected , testCase1.solution(input, 1));
	}

}
