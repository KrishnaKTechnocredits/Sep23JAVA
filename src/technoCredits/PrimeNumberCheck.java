package technoCredits;

public class PrimeNumberCheck {

	/**
	 * 
	 * 2 3/2 5/2 7/2 11/2 13/2 17/2
	 */

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			isPrime(i);
		}
	}

	static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
