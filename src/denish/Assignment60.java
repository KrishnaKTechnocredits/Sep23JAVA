package denish;

import java.util.Scanner;

public class Assignment60 {

	void split(String input) {
		String[] arr = input.split(" ");
		System.out.println("Sum Of Digits In Given Input: ");
		for (int index = 0; index < arr.length; index++) {
			this.processData(arr[index]);
		}
	}

	void processData(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(input + " -> " + sum);
	}

	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Give Input String: ");
		String input = sc.nextLine();
		assignment60.split(input);
		sc.close();
	}
}
