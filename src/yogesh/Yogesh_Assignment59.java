//Assignment - 59 : 21st Oct'2023
//
//Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.
//
//input : 
//enter input 1 : 23
//enter input 2 : 20
package yogesh;

import java.util.Scanner;

public class Yogesh_Assignment59 {

	int ans;

	void add(int a, int b) {
		ans = a + b;
		System.out.println("Summation is " + ans);
	}

	void substraction(int a, int b) {
		ans = a - b;
		System.out.println("Substraction  is " + ans);
	}

	void multiplication(int a, int b) {
		ans = a * b;
		System.out.println("Multiplication  is " + ans);
	}

	void division(int a, int b) {
		ans = a / b;
		System.out.println("Division is " + ans);
	}

	public static void main(String[] args) {
		Yogesh_Assignment59 assignment59 = new Yogesh_Assignment59();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();


		while (true) {
			System.out.println("Please enter operation to be performed : ");
			String operation = sc.next();
			if (operation.equals("add")) {
				assignment59.add(num1, num2);
			} else if (operation.equals("sub")) {
				assignment59.substraction(num1, num2);
			} else if (operation.equals("multi")) {
				assignment59.multiplication(num1, num2);
			} else if (operation.equals("div")) {
				assignment59.division(num1, num2);
			}

			else {
				System.out.println("please choose valid operation, valid operations are [add, multi, div, sub]");
				continue;
			}
			System.out.println("Would like to continue (Yes/No) ?");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
		}
	}
}
