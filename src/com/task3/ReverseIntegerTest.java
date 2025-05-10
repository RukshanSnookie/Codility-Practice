package com.task3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void testNumberReverse() {
		ReverseInteger revNum = new ReverseInteger();
		assertEquals(123, revNum.numberReverse(321));
	}

	@Test
	public void testNumberReverse2() {
		ReverseInteger revNum = new ReverseInteger();
		assertEquals(7798, revNum.numberReverse(8977));
	}
}
