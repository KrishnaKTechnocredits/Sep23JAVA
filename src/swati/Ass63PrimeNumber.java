/*Assignment - 63 : 22nd Oct'2023 1. Count the prime number in range of 50 to 150

 *  2.Do sum of number in range of 50 to 150, only if number is odd & prime*/
package swati;

public class Ass63PrimeNumber {
	boolean isPrimeNumber(int num) {
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	void printPrimeNumber(int startNum, int endNum) {
		int count = 0;
		int sum = 0;
		for (int index = startNum; index < endNum; index++) {
			if (this.isPrimeNumber(index)) {
				count++;
				sum += index;
			}
		}
		System.out.println("Prime numbers in given range " + startNum + " to " + endNum + " are " + count);
		System.out.println("Sum of prime numbers in given range " + startNum + " to " + endNum + " is " + sum);
	}

	public static void main(String[] args) {
		Ass63PrimeNumber ass63 = new Ass63PrimeNumber();
		ass63.printPrimeNumber(50, 150);
	}
}
