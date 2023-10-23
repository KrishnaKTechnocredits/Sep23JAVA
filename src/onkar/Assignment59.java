/*Using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.

input : 
enter input 1 : 23
enter input 2 : 20

which operation you want to perform, valid operations are [add,sub,mul,div].
add

output : sum of 23 and 20 is 43*/

package onkar;

import java.util.Scanner;

public class Assignment59 {

	void add(int num1, int num2) {
		int output = num1 + num2;
		System.out.println("Sum of 2 numbers "+num1+" & "+num2+" is : "+output);
	}

	void sub(int num1, int num2) {
		int output = num1 - num2;
		System.out.println("Substraction of 2 numbers "+num1+" & "+num2+" is : "+output);
	}

	void mul(int num1, int num2) {
		int output = num1 * num2;
		System.out.println("Multiplication of 2 numbers "+num1+" & "+num2+" is : "+output);
	}

	void div(int num1, int num2) {
		int output = num1 / num2;
		System.out.println("Division of 2 numbers "+num1+" & "+num2+" is : "+output);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		Assignment59 assignment59 = new Assignment59();
		assignment59.add(num1, num2);
		assignment59.sub(num1, num2);
		assignment59.mul(num1, num2);
		assignment59.div(num1, num2);
	}
}
