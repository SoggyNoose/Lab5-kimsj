import java.util.ArrayList;


public class Sieve {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		ArrayList<Boolean> sieve = new ArrayList<Boolean>();
		for(int i=0; i<n; i++) {
			sieve.add(false);
		}
		
		for(int i=2; i<n/2; i++) {
			if (!sieve.get(i)) {
				for(int j=2*i; j<n; j += i) {
					sieve.set(j, true);
				}
			}
		}
		
		for(int i=2; i < n; i++) {
			if (!sieve.get(i)) {
				ret.add(i);
			}
		}
			
		return ret;
	}
}
