package uniquesumtest;

import static org.junit.Assert.*;

import org.junit.Test;

import src.UniqueSum;

public class UniqueSumTest {


	@Test
	public void testUniqueSum() {
		UniqueSum us = new UniqueSum();

		
		assertEquals(us.uniqueSum(2, 1, 1), 2);
		assertEquals(us.uniqueSum(-5, -2, 15), 8);
		assertEquals(us.uniqueSum(3, 2, 2), 3);
		assertEquals(us.uniqueSum(16, 16, 16), 0);
		assertEquals(us.uniqueSum(-3, 4, 4), -3);
		assertEquals(us.uniqueSum(-2, -2, 6), 6);
	}

}
