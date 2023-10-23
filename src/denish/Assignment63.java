package denish;

public class Assignment63 {

	boolean primeNumber(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	void sumOfPrimeNum() {
		int count = 0;
		int sum = 0;
		for (int num = 50; num <= 150; num++) {
			if (this.primeNumber(num)) {
				count++;
				sum = sum + num;
			}
		}
		System.out.println("Count the prime number in range of 50 to 150 is : " + count);
		System.out.println("Sum of prime numbers in range of 50 to 150 is: " + sum);
	}

	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		assignment63.sumOfPrimeNum();
	}
}
