/*Assignment - 63 : 22nd Oct'2023

1. Count the prime number in range of 50 to 150
2. Do sum of number in range of 50 to 150, only if number is odd & prime */
package shrutika;

public class As63PrimeNumer {

	boolean prime(int num) {
		// boolean flag = false;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
			// flag = false;
		}
		return true;
		// flag= true;
	}
	// if (flag == true) {
	// System.out.println("Number is Prime");
	// } else
	// System.out.println("Number is not Prime");

	void primeNumberCount(int startNum, int endNum) {
		int count = 0;
		int sum = 0;
		for (int num = startNum; num <= endNum; num++) {
			boolean flag = prime(num);
			if (flag == true) {
				count++;
				if (num % 2 != 0)
					sum = sum + num;
			}
		}
		System.out.println("from given range " + startNum + "," + endNum + " Prime number count is - > " + count);
		System.out.println("from given range " + startNum + "," + endNum + " sum of odd Prime number is - > " + sum);
	}

	public static void main(String[] args) {
		As63PrimeNumer as63PrimeNumer = new As63PrimeNumer();
		as63PrimeNumer.primeNumberCount(50, 150);
	}
}
