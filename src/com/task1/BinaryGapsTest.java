package com.task1;
import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapsTest {

	@Test
	public void testSample1() {
		BinaryGaps bGaps = new BinaryGaps();
		assertEquals(5, bGaps.solution(1041));
	}
	
	@Test
	public void testSample2() {
		BinaryGaps bGaps = new BinaryGaps();
		assertEquals(4, bGaps.solution(529));
	}
	
	

}



//4 > 529
//0 > 32
