import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		
		while (n>1) {
			if ((n%2)==0) {
				ret.add(2);
				n /= 2;
			} else {
				break;
			}
		}
		if (n > 1) {
			ret.add(n);
		}
		
		return ret;
	}
}
