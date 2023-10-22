/* Take 2 valid numbers from user using scanner class and use exception handling mechanims. */

package sayali;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment61 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		while (true) {
			try {
				System.out.println("Please enter first valid number");
				number1 = sc.nextInt();
				System.out.println("Please enter second valid number");
				number2 = sc.nextInt();
				break;
			} catch (InputMismatchException ie) {
				sc.next();
				System.out.println("Please provide valid input");
			}
		}
		System.out.println("You have entered valid numbers as " + number1 + " & " + number2);
		sc.close();
	}
}