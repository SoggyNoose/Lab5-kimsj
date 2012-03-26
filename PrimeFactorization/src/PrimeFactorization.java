import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		if (n > 1) {
			ret.add(n);
		}
		
		return ret;
	}
}
