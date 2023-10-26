/*
Assignment - 60 : 21st Oct'2023
Using scanner class, print digit sum of each name.

input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4
*/
package deepak;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment60_ScannerDigitSum {

	int getDigitSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	void getInput(String input) {
		String[] arr = input.split(" ");
		System.out.println("Input String converted into Array: " + Arrays.toString(arr));
		System.out.println("Output: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + " -> " + getDigitSum(arr[index]));
		}
	}

	public static void main(String[] args) {
		Assignment60_ScannerDigitSum output = new Assignment60_ScannerDigitSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input = sc.nextLine();
		output.getInput(input);
		sc.close();
	}
}
