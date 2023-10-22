package denish;

import java.util.Scanner;

public class Assignment59 {

	void add(int num1, int num2) {
		System.out.println("Sum is: " + (num1 + num2));
	}

	void sub(int num1, int num2) {
		System.out.println("Substraction is: " + (num1 - num2));
	}

	void mul(int num1, int num2) {
		System.out.println("Multiplication is: " + (num1 * num2));
	}

	void div(int num1, int num2) {
		System.out.println("Division is: " + (num1 / num2));
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		while (true) {
			System.out.println("Which operation you want to perform: ");
			String operation = sc.next();
			if (operation.equals("add")) {
				assignment59.add(num1, num2);
			} else if (operation.equals("sub")) {
				assignment59.sub(num1, num2);
			} else if (operation.equals("mul")) {
				assignment59.mul(num1, num2);
			} else if (operation.equals("div")) {
				assignment59.div(num1, num2);
			} else {
				System.out.println("Please enter valid operation to perform");
				continue;
			}
			System.out.println("Do you like to continue (Yes/No) ?");
			String wish = sc.next();
			if (wish.equals("No")) {
				break;
			}
		}
		sc.close();
	}
}
