package test;

import static org.junit.Assert.*;

import org.junit.Test;

import testexercise.TooHot;



public class TooHotTest {

	@Test
	public void testTooHot() {
		boolean result = TooHot.tooHot(100, true);
		assertTrue("boolean was false", result);
	}
	
	
}
