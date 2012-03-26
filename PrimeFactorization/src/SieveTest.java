import java.util.ArrayList;



public class SieveTest {

	@Test
	public void testOne() {
		assertEquals(list(), Sieve.generatePrimes(1));
	}
	
	private ArrayList<Integer> list(int... ints){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i : ints){
			ret.add(i);
		}
		return ret;
	}
}
