/*
Assignment - 61 : 21st Oct'2023
Take 2 valid numbers from user using scanner class and use exception handling mechanims.
*/

package deepak;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61_ScannerCalculatorValidNum {

	void getValidNum() {
		int num1 = 0, num2 = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Enter the first number");
				num1 = sc.nextInt();
				System.out.println("Enter the second number");
				num2 = sc.nextInt();
				break;
			} catch (InputMismatchException ie) {
				sc.nextLine();
				System.out.println("Please enter a valid number!");
			}
		}
		System.out.println("Sum of " + num1 + " and " + num2 + " is :" + (num1 + num2));
		System.out.println("Substraction of " + num1 + " and " + num2 + " is :" + (num1 - num2));
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" + (num1 * num2));
		System.out.println("Division of " + num1 + " and " + num2 + " is :" + (num1 / num2));
	}

	public static void main(String[] args) {
		Assignment61_ScannerCalculatorValidNum output = new Assignment61_ScannerCalculatorValidNum();
		output.getValidNum();
	}

}
