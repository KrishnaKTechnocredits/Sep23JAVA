/*
 * Assignment-67 : 28th Oct'2023

using ternary operator, write a method to return operation code. : 
if operation is debit return 1,
if operation is credit return 2,
if operation is printBalance return 3,
for any other operation, return -1.

input -> "debit"
output -> 1
 */

package jyoti_scanner_exception;

import java.util.Scanner;

public class Assignment67 {

	int getOpCode(String operations) {
		return operations.equals("Debit") ? 1
				: operations.equals("Credit") ? 2 : operations.equals("PrintBalance") ? 3 : -1;
	}

	public static void main(String[] args) {
		Assignment67 ass = new Assignment67();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please entrer the operation code");
			String operation = sc.next();
			System.out.println("You choose operation code as --->" + operation);
			System.out.println("Output of selected operation is-->" + ass.getOpCode(operation));
			System.out.println("Would you like to continue Yes/No");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
		}
		sc.close();
	}

}
