import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		int candidate = 2;
		while (n>1) {
			if ((n%candidate)==0) {
				ret.add(candidate);
				n /= candidate;
			} else {
				candidate++;
			}
		}
				
		return ret;
	}
}
