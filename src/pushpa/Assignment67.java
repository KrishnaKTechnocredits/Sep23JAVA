//Assignment-67 : 28th Oct'2023
//
//using ternary operator, write a method to return operation code. : 
//if operation is debit return 1,
//if operation is credit return 2,
//if operation is printBalance return 3,
//for any other operation, return -1.
//
//input -> "debit"
//output -> 1

package pushpa;

import java.util.Scanner;

public class Assignment67 {

	public int operationCode(String input) {

		int result = input.equals("debit") ? 1 : input.equals("credit") ? 2 : input.equals("printBalance") ? 3 : -1;

		return result;
	}

	public static void main(String[] args) {
		Assignment67 assignment67 = new Assignment67();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter operation type (credit , debit, printBalance etc.)");
		String code = scanner.next();
		int result = assignment67.operationCode(code);
		System.out.println("Operation code is :"+result);
	}

}
