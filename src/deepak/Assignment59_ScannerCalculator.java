/*
 * Assignment - 59 : 21st Oct'2023
Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.

input : 
enter input 1 : 23
enter input 2 : 20

which operation you want to perform, valid operations are [add,sub,mul,div].
add
output : sum of 23 and 20 is 43

 */
package deepak;

import java.util.Scanner;

class Assignment59_ScannerCalculator {

	void add(int num1, int num2) {
		System.out.println("Sum of " + num1 + " and " + num2 + " is :" + (num1 + num2));
	}

	void substract(int num1, int num2) {
		System.out.println("Substraction of " + num1 + " and " + num2 + " is :" + (num1 - num2));
	}

	void multiply(int num1, int num2) {
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is :" + (num1 * num2));
	}

	void division(int num1, int num2) {
		System.out.println("Division of " + num1 + " and " + num2 + " is :" + (num1 / num2));
	}

	void inputAction() {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the first digit.");
			int num1 = sc.nextInt();
			System.out.println("Please enter the second digit.");
			int num2 = sc.nextInt();

			System.out.println("Please let us know which action to perform - add/sub/mul/div");
			String action = sc.next();

			if (action.equals("add")) {
				add(num1, num2);
			} else if (action.equals("sub")) {
				substract(num1, num2);
			} else if (action.equals("mul")) {
				multiply(num1, num2);
			} else if (action.equals("div")) {
				division(num1, num2);
			} else {
				System.out.println("Incorrect action entered!");
				continue;
			}
			System.out.println("Would you like to continue? (yes/no)");
			String temp = sc.next();
			if (temp.equals("yes"))
				continue;
			else if (temp.equals("no"))
				break;
			else
				System.out.println("Incorrect Response!");
			break;
		}
	}

	public static void main(String[] args) {
		Assignment59_ScannerCalculator output = new Assignment59_ScannerCalculator();
		output.inputAction();
	}
}