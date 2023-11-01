
//Assignment - 59 : 21st Oct'2023
//
//Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.
//
//input : 
//enter input 1 : 23
//enter input 2 : 20
//
//which operation you want to perform, valid operations are [add,sub,mul,div].
//add
//
//output : sum of 23 and 20 is 43

package pushpa;

import java.util.Scanner;

public class Assignment59 {

	public void add(int num1, int num2) {
		System.out.println("Addition is :" + (num1 + num2));
	}

	public void sub(int num1, int num2) {
		System.out.println("Substraction is :" + (num1 - num2));
	}

	public void mult(int num1, int num2) {
		System.out.println("Multiplication is :" + (num1 * num2));
	}

	public void div(int num1, int num2) {
		System.out.println("Division is :" + (num1 / num2));
	}

	public static void main(String[] args) {
		Assignment59 assignment59 = new Assignment59();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		while (true) {
			System.out.println("which operation you want to perform, operations are [add,sub,mul,div]");
			String operation = scanner.next();

			if (operation.equals("add"))
				assignment59.add(num1, num2);
			else if(operation.equals("sub"))
				assignment59.sub(num1, num2);
			else if(operation.equals("mult"))
				assignment59.mult(num1, num2);
			else if(operation.equals("div"))
				assignment59.div(num1, num2);
			else {
				System.out.println("Please enter valid input");
				continue ;
			}
				
			System.out.println("Do you want to continue Yes/No");
			String choice = scanner.next();
			if(choice.equals("No"))
				break;
			
		}
		scanner.close();
	}

}
