package shrutika;

import java.util.Scanner;

public class As59ScannerCalculator {

	void add(int num1, int num2) {
		int answer = num1 + num2;
		System.out.println("Addition of " + num1 + "+" + num2 + " is = " + answer);
	}

	void sub(int num1, int num2) {
		int answer = num1 - num2;
		System.out.println("Subtraction of " + num1 + "-" + num2 + " is = " + answer);
	}

	void div(int num1, int num2) {
		int answer = num1 / num2;
		System.out.println("Divison of " + num1 + "/" + num2 + " is = " + answer);
	}

	void mul(int num1, int num2) {
		int answer = num1 * num2;
		System.out.println("Multiplication of " + num1 + "*" + num2 + " is = " + answer);
	}

	public static void main(String[] args) {
		As59ScannerCalculator as59ScannerCalculator = new As59ScannerCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int num2 = sc.nextInt();
		while (true) {
			System.out.println("Which operation do you want to perform ? ");
			String operation = sc.next();
			if (operation.equals("Addition")) {
				as59ScannerCalculator.add(num1, num2);
			} else if (operation.equals("Subtraction")) {
				as59ScannerCalculator.sub(num1, num2);
			} else if (operation.equals("Multiplication")) {
				as59ScannerCalculator.mul(num1, num2);
			} else if (operation.equals("Division")) {
				as59ScannerCalculator.div(num1, num2);
			} else {
				System.out.println("Please choose valid operation");
				continue;
			}
			System.out.println("Do you want to continue (Yes/No) ?");
			String wish = sc.next();
			if (wish.equals("No")) {
				break;
			}
		}
		sc.close();
	}
}