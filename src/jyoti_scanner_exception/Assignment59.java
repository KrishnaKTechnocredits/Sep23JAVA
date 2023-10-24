/*Assignment - 59 : 21st Oct'2023

Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.

input : 
enter input 1 : 23
enter input 2 : 20

which operation you want to perform, valid operations are [add,sub,mul,div].
add

output : sum of 23 and 20 is 43*/

package jyoti_scanner_exception;

import java.util.Scanner;

public class Assignment59 {

	void add(int num1, int num2) {
		System.out.println("Addition of given numbers are-->" + (num1 + num2));

	}

	void substract(int num1, int num2) {
		int sub;
		if(num1>num2) {
			sub=num1-num2;
		}else {
			sub=num1-num2;	
		}
		System.out.println("Substraction of given numbers are-->" + sub);

	}

	void division(int num1, int num2) {
		System.out.println("Division of given numbers are-->" + (num1 / num2));

	}

	void multiplication(int num1, int num2) {
		System.out.println("Multiplication of given numbers are-->" + (num1 * num2));

	}

	public static void main(String[] args) {
		Assignment59 ass = new Assignment59();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter num1");
		int num1=sc.nextInt();
		System.out.println("Please enter num2");
		int num2=sc.nextInt();
		while(true){
		System.out.println("Please enter Operation to be performed");
		String operation=sc.next();
		if (operation.equals("add")) {
			ass.add(num1, num2);
		}else if(operation.equals("substract")) {
			ass.substract(num1, num2);
			
		}else if(operation.equals("division")) {
			ass.division(num1, num2);
		}else if(operation.equals("multiplication")) {
			ass.multiplication(num1, num2);
		}else {
		System.out.println("Please choose valid operation ,valid operation are [add,substract,division and multiplication]");
		continue;
		}
		System.out.println("Would you like to continue Yes/No");
		String temp=sc.next();
		if(temp.equals("No")) {
			break;
		}
	}sc.close();
}
}