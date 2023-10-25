
package jyoti_scanner_exception;

public class Assignment63 {

	static boolean isPrime(int num) {

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0)
				return false;
		}
		System.out.print(num + " ,");
		return true;
	}

	void getPrimeNumber(int startNum, int endNum) {
		int count = 0;
		int sum = 0;
		for (int index = startNum; index <= endNum; index++) {
			if (isPrime(index)) {
				count++;
				sum = sum + index;
			}

		}
		System.out.println('\n' + "Count-->" + '\n' + count);
		System.out.println("Sum of Prime number in range " + startNum + " And " + endNum + " is ---->" + sum);
	}

	public static void main(String[] args) {

		Assignment63 ass = new Assignment63();

		ass.getPrimeNumber(50, 150);

	}

}
