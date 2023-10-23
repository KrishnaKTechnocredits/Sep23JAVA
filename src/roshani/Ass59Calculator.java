/*Assignment - 59 : 21st Oct'2023

Using scanner class, take 2 inputs from user and ask user which 
operation they would like to perform , accordingly call methods 
of calculator.

input : 
enter input 1 : 23
enter input 2 : 20

which operation you want to perform, valid operations are 
[add,sub,mul,div].
add

output : sum of 23 and 20 is 43
*/
package roshani;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass59Calculator{
	int output = 0;
	
	void addition(int num1, int num2){
		output = num1 + num2;
		System.out.println("Addition of 2 numbers is : " + output);	
	}
	
	void subtraction(int num1, int num2){
		output = num1 - num2;
		System.out.println("Subtraction is: " + output);
	}
	
	void multiplication(int num1, int num2){
		output = num1 * num2;
		System.out.println("Multiplication is: " + output);
	}
	
	void division(int num1, int num2){
		output = num1 / num2;
		System.out.println("Division is: " + output);
	}
	
	public static void main(String[] args){
		Ass59Calculator assignment59 = new Ass59Calculator();
		Scanner sc = new Scanner(System.in);
		int num1 = 0; 
		int num2 = 0;
		
		while(true) {
			try {
				System.out.println("Enter first number: ");
				num1 = sc.nextInt();
				System.out.println("Enter second number: ");
				num2 = sc.nextInt();
				break;
			}catch(InputMismatchException ie) {
				sc.nextLine();
			}
		}
		
		while(true) {
			System.out.println("Which operation you would like to perform: " + "[Add/Sub/Mul/Div]?");
			String operation = sc.next();
			if(operation.equals("Add")) {
				assignment59.addition(num1, num2);
			}else if(operation.equals("Sub")) {
				assignment59.subtraction(num1, num2);
			}else if(operation.equals("Mult")) {
				assignment59.multiplication(num1, num2);
			}else if(operation.equals("Div")) {
				assignment59.division(num1, num2);
			}else {
				System.out.println("Please Select valid operation");
				continue;
			}
			System.out.println("Would you like to perform any more operation(Y/N)?");
			String ans = sc.next();
			if(ans.equals("N")) {
				break;
			}
		}
		sc.close();
	}
}

		  


