import java.util.ArrayList;


public class Sieve {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ret = new ArrayList<Integer>();
		
		if (n>2) {
			ret.add(2);
		}
		
		return ret;
	}
}
