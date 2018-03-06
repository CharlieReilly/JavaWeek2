package BlackjackTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class blackjacktest {

	@Test
	public void test() {
		BlackJack bj = new BlackJack();
		assertEquals(bj.blackJack(21,21),0);
		assertEquals(bj.blackJack(211,231),0);
		assertEquals(bj.blackJack(-5,-7),0);
		assertEquals(bj.blackJack(1234,4),4);
		assertEquals(bj.blackJack(21,342),21);
		assertEquals(bj.blackJack(13,-3),13);
		assertEquals(bj.blackJack(-5,17),17);
		assertEquals(bj.blackJack(-4,25), 0);
		assertEquals(bj.blackJack(45,-4),0);
	}

}
