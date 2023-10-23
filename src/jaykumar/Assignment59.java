/*Assignment - 59 : 21st Oct'2023
Using scanner class, take 2 inputs from user 
and ask user which operation they would like to perform , 
accordingly call methods of calculator.*/


package jaykumar;

import java.util.Scanner;

public class Assignment59 {
	
	void add(int num1, int num2) {
		System.out.println("Sum of given inputs is: "+(num1+num2));
	}
	
	void sub(int num1, int num2) {
		System.out.println("Substraction of given inputs is: "+(num1-num2));
	}
	
	void mul(int num1, int num2) {
		System.out.println("Multiplication of given inputs is: "+(num1*num2));
	}
	
	void div(int num1, int num2) {
		System.out.println("Division of given inputs is: "+(num1/num2));
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter input 2: ");
		int num2 = sc.nextInt();
		while(true) {
			System.out.println("Which operation you want to perform: ");
			String operation = sc.next();
			if(operation.equals("add")) {
				assignment59.add(num1, num2);
			}else if(operation.equals("sub")) {
				assignment59.sub(num1, num2);
			}else if(operation.equals("mul")) {
				assignment59.mul(num1, num2);
			}else if(operation.equals("div")) {
				assignment59.div(num1, num2);
			}else {
				System.out.println("Please enter valid operation to perform");
				continue;
			}
			System.out.println("Do you wish to continue (Yes/No) ?");
			String wish = sc.next();
			if(wish.equals("No")) {
				break;
			}
		}
		sc.close();
	}
}
