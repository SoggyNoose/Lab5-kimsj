import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class SieveTest {

	@Test
	public void testOne() {
		assertEquals(list(), Sieve.generatePrimes(1));
	}
	
	@Test
	public void testTwo() {
		assertEquals(list(), Sieve.generatePrimes(2));
	}
	
	@Test
	public void testThree() {
		assertEquals(list(2), Sieve.generatePrimes(3));
	}
	
	@Test
	public void testFour() {
		assertEquals(list(2, 3), Sieve.generatePrimes(4));
	}
	
	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
