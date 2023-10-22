/* Using exception handling write below code.

String str = "I have total 9 years and 2 months of experience";
output : 11

String[] word = str.split(" ");
sum =  sum + Integer.parseInt */

package sayali;

import java.util.Scanner;

public class Assignment62 {

	void splitInputString(String input) {
		int sum = 0;
		String[] word = input.split(" ");
		for (int index = 0; index < word.length; index++) {
			try {
				sum += Integer.parseInt(word[index]);
			} catch (NumberFormatException nfe) {

			}
		}
		System.out.println("\nSum of numbers from input string is " + sum);
	}

	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter input string: ");
		String input = sc.nextLine();
		assignment62.splitInputString(input);
		sc.close();
	}
}
