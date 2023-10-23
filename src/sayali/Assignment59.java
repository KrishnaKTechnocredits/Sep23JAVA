/* WAP using scanner class, take 2 inputs from user and ask user which operation they would like to perform , accordingly call methods of calculator.

input : 
enter input 1 : 23
enter input 2 : 20

which operation you want to perform, valid operations are [add,sub,mul,div].
add

output : sum of 23 and 20 is 43 */

package sayali;

import java.util.Scanner;

public class Assignment59 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter input 2 : ");
		int num2 = sc.nextInt();

		while (true) {
			System.out.println("\nPlease select which operation you want to perform [add, sub, mul, div]: ");
			String operation = sc.next();
			int result = performOperation(num1, num2, operation);
			System.out.println("Would you like to continue (Yes/No) ?");
			String temp = sc.next();
			if (temp.equals("No"))
				break;

		}
		sc.close();

	}

	public static int performOperation(int num1, int num2, String operation) {

		int result;
		if (operation.equals("add")) {
			result = num1 + num2;
			System.out.println("\nOutput: Sum of " + num1 + " & " + num2 + " is: " + result);
		} else if (operation.equals("sub")) {
			if (num1 > num2) {
				result = num1 - num2;
			} else
				result = num2 - num1;
			System.out.println("\nOutput: Difference of " + num1 + " & " + num2 + " is: " + result);
		} else if (operation.equals("mul")) {
			result = num1 * num2;
			System.out.println("\nOutput of: Multiplicaton of " + num1 + " & " + num2 + " is: " + result);
		} else if (operation.equals("div")) {
			result = num1 / num2;
			System.out.println("\nOutput of Division of " + num1 + " & " + num2 + " is: " + result);
		} else {
			System.out.println("\nInvalid operation");
			return 0;
		}
		return result;

	}

}