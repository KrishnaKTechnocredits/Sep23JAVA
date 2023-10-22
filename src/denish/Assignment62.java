package denish;

import java.util.Scanner;

public class Assignment62 {

	void split(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			try {
				sum = sum + Integer.parseInt(arr[index]);
			} catch (NumberFormatException nfe) {

			}
		}
		System.out.println("Sum Of Digits In Given String : " + sum);
	}

	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.nextLine();
		assignment62.split(input);
		sc.close();
	}
}
