/*WAP for 1. Count the prime number in range of 50 to 150
2. Do sum of number in range of 50 to 150, only if number is odd & prime */

package sayali;

public class Assignment63 {

	boolean checkPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	void oddPrimeSum() {
		int count = 0;
		int sum = 0;
		for (int num = 50; num <= 150; num++) {
			if (this.checkPrime(num)) {
				count++;
				sum += num;
			}
		}
		System.out.println("Count of prime numbers in the range of 50 to 150 is: " + count);
		System.out.println("Sum of odd prime numbers in the range of 50 to 100 is: " + sum);
	}

	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		assignment63.oddPrimeSum();
	}
}