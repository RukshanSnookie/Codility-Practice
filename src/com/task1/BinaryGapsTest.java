package com.task1;
import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapsTest {

	@Test
	public void testSample1() {
		BinaryGaps bGaps = new BinaryGaps();
		assertEquals(5, bGaps.solution(1041));
	}

}
