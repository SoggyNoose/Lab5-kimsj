import java.util.ArrayList;


public class Sieve {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ArrayList<Boolean> sieve = new ArrayList<Boolean>();
		
		// Initialize array
		for(int i=0; i<n; i++) {
			sieve.add(false);
		}
		
		// Mark off candidates
		for(int i=2; i<Math.sqrt(n); i++) {
			if (!sieve.get(i)) {
				for(int j=2*i; j<n; j += i) {
					sieve.set(j, true);
				}
			}
		}
		
		// Find all remaining candidates
		for(int i=2; i < n; i++) {
			if (!sieve.get(i)) {
				ret.add(i);
			}
		}
			
		return ret;
	}
}
