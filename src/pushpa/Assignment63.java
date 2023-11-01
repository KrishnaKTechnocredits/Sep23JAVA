//Assignment - 63 : 22nd Oct'2023
//
//1. Count the prime number in range of 50 to 150
//2. Do sum of number in range of 50 to 150, only if number is odd & prime

package pushpa;

import java.util.Scanner;

public class Assignment63 {

	public boolean isPrimeNumber(int no) {
		for (int i = 2; i < no / 2; i++) {
			if (no % i == 0)
				return false;

		}
		return true;
	}

	public void printPrimeCount(int input1, int input2) {
		int primeCount = 0;
		for (int i = input1; i <= input2; i++) {
			boolean result = isPrimeNumber(i);
			if (result == true)
				primeCount++;
		}
		System.out.println("Total prime no between " + input1 + " and " + input2 + " are:" + primeCount);
	}

	public void calcSumOfPrimeAndOddNos(int input1, int input2) {
		int sum = 0;
		for (int i = input1; i <= input2; i++) {
			boolean result = isPrimeNumber(i);
			if (result == true && i % 2 != 0)
				sum += i;
		}
		System.out.println("Sum of nos which prime and odd nos: " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment63 assignment63 = new Assignment63();
		System.out.println("Enter the Range:");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		assignment63.printPrimeCount(input1, input2);
		assignment63.calcSumOfPrimeAndOddNos(input1, input2);
		scanner.close();
	}

}
