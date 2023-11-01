//Assignment - 62 : 21st Oct'2023
//Using exception handling write below code.
//
//String str = "I have total 9 years and 2 months of experience";
//output : 11
//
//String[] word = str.split(" ");
//sum =  sum + Integer.parseInt

package pushpa;

import java.util.Scanner;

public class Assignment62 {

	public void calculateSum(String input) {
		String word[] = input.split(" ");
		int sum = 0;
		for (int i = 0; i < word.length; i++) {
			try {
				sum = sum + Integer.parseInt(word[i]);
			}

			catch (NumberFormatException exception) {

			}
		}
		System.out.println("Sum is: " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Assignment62 assignment62 = new Assignment62();
		System.out.println("Enter String:");
		String input = scanner.nextLine();
		assignment62.calculateSum(input);
		scanner.close();
	}

}
