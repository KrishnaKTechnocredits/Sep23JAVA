package denish;

import shrutika.AsciiAssig31;

public class Assignment34 {

	void printSumOfNumber(int[] arr) {
		int evensum = 0;
		int oddsum = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evensum += arr[index];
			} else {
				oddsum += arr[index];
			}
		}
		if (evensum > oddsum) {
			System.out.println("Sum is -> " + (evensum - oddsum));
		} else {
			System.out.println("Sum is -> " + (oddsum - evensum));
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 3, 44, 33, 35 };
		Assignment34 assignment34 = new Assignment34();
		assignment34.printSumOfNumber(input);
	}
}
