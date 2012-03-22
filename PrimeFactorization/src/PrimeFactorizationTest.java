import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeFactorizationTest {

	@Test
	public void testOne() {
		assertEquals(new ArrayList<Integer>(), PrimeFactorization.generatePrimes(1));
	}
}
