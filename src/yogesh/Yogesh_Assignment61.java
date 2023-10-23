//Assignment - 61 : 21st Oct'2023
//Take 2 valid numbers from user using scanner class and use exception handling mechanims.
package yogesh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Yogesh_Assignment61 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		while (true) {
			try {
				System.out.println("Please enter first number");
				number1 = sc.nextInt();
				System.out.println("Please enter second number");
				number2 = sc.nextInt();
				break;
			} catch (InputMismatchException ie) {
				sc.next();
				System.out.println("Please provide valid input");
			}
		}
		System.out.println("You have entered numbers as " + number1 + " & " + number2);
		sc.close();
	}
}


