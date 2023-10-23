/*Assignment - 59 : 21st Oct'2023 Using scanner class, take 2 inputs from user 
and ask user which operation they would like to perform , accordingly call
methods of calculator. input : enter input 1 : 23 enter input 2 : 20 which
operation you want to perform, 
valid operations are [add,sub,mul,div]. add output : sum of 23 and 20 is 43*/
package swati;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass59CalcutorUSingScanner {

	void addition(int num1, int num2) {
		int add = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is = " + add);
	}

	void subtraction(int num1, int num2) {
		int sub = num1 - num2;
		System.out.println("subtraction of " + num1 + " and " + num2 + " is = " + sub);
	}

	void multiplication(int num1, int num2) {
		int mul = num1 * num2;
		System.out.println("multiplication of " + num1 + " and " + num2 + " is = " + mul);
	}

	void division(int num1, int num2) {
		int div = num1 / num2;
		System.out.println("division of " + num1 + " and " + num2 + " is = " + div);
	}

	public static void main(String[] args) {
		int x, y;
		Ass59CalcutorUSingScanner ass59 = new Ass59CalcutorUSingScanner();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("Enter first number");
				x = sc.nextInt();
				System.out.println("Enter second number");
				y = sc.nextInt();
				break;
			} catch (InputMismatchException ie) {
				sc.nextLine();
			}
		}
		while (true) {
			System.out.println("Which operation you would like to perform" + "[Add/Sub/Mul/Div] ?");
			String operation = sc.next();
			if (operation.equals("Add")) {
				ass59.addition(x, y);
			} else if (operation.equals("Sub")) {
				ass59.subtraction(x, y);
			} else if (operation.equals("Mul")) {
				ass59.multiplication(x, y);
			} else if (operation.equals("Div")) {
				ass59.division(x, y);
			} else {
				System.out.println("Please selected valid opeation type");
				continue;
			}
			System.out.println("Would you like to perform more operation(Yes/No)?");
			String ans = sc.next();
			if (ans.equals("No")) {
				break;
			}
		}
		sc.close();
	}
}
