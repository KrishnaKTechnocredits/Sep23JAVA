/*
Assignment - 60 : 21st Oct'2023
Using scanner class, print digit sum of each name.
input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output : Say2al 1i -> 3
		Ad9it5ya -> 14
		Shr4utik2a -> 6
		Saks4hi -> 4
*/
package nivedita;

import java.util.Scanner;

public class A60PrintSum {

	void printDigitSum(String input) {

		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(input + "->" + sum);

	}

	public static void main(String[] args) {
		A60PrintSum printSum = new A60PrintSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String name = sc.nextLine();
		String[] input = name.split(" ");
		System.out.println("Sum of digits of given input are as below: ");
		for (int index = 0; index < input.length; index++) {
			printSum.printDigitSum(input[index]);
		}
		sc.close();
	}
}
