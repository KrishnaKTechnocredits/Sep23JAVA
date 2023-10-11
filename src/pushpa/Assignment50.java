//Assignment - 50 : 8th Oct'2023
//Find the second max from given array.
//int[] age = {13,45,2,48,89,11,19,91};
//output : 89

package pushpa;

import java.util.Scanner;

public class Assignment50 {

	public void finSecondMaxNum(int input[]) {
		int firstMax = input[0], secondMax = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > firstMax) {
				secondMax = firstMax;
				firstMax = input[i];
			}
		}
		System.out.println("Second Maximum Number :" + secondMax);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[8];
		System.out.println("Enter Numbers: ");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		Assignment50 assignment50 = new Assignment50();
		assignment50.finSecondMaxNum(input);
		scanner.close();
	}

}
