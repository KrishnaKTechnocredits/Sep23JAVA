//Assignemnt64: 
//first 5 armstrong number from range 900 to 1100

package pushpa;

import java.util.Scanner;

public class Assignment64 {

	public boolean checkArmstrongNumber(int no) {
		int temp = no, sum = 0;

		while (no > 0) {
			int rem = no % 10;
			sum += Math.pow(rem, 3);
			no /= 10;

		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	public void printArmstrongNumbers(int input1, int input2) {
		int count = 0;
		for (int i = input1; i <= input2; i++) {
			boolean result = checkArmstrongNumber(i);
			if (result) {
				System.out.println(i);
				count++;
				if (count > 5)
					break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment64 assignment64 = new Assignment64();
		System.out.println("Enter the Range:");
		int input1 = scanner.nextInt();
		int input2 = scanner.nextInt();
		assignment64.printArmstrongNumbers(input1, input2);
		scanner.close();
	}

}
