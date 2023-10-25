/*Assignment - 59 : 21st Oct'2023
Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.
enter input 1 : 23
enter input 2 : 20 */

package nivedita;

import java.util.Scanner;

public class A59CalMethod {

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
		A59CalMethod calMethod = new A59CalMethod();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();


		while (true) {
			System.out.println("Please enter operation to be performed : ");
			String operation = sc.next();
			if (operation.equals("add")) {
				calMethod.add(num1, num2);
			} else if (operation.equals("sub")) {
				calMethod.substraction(num1, num2);
			} else if (operation.equals("multi")) {
				calMethod.multiplication(num1, num2);
			} else if (operation.equals("div")) {
				calMethod.division(num1, num2);
			}

			else {
				System.out.println("please choose valid operation, valid operations are [add, multi, div, sub]");
				continue;
			}
			System.out.println("Would you like to continue (Yes/No) ?");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
		}
		sc.close();
	}
}
