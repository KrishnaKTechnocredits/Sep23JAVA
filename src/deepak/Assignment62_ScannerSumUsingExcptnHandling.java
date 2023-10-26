/*
Assignment - 62 : 21st Oct'2023
Using exception handling write below code.

String str = "I have total 9 years and 2 months of experience";
output : 11

String[] word = str.split(" ");
sum =  sum + Integer.parseInt(word);
*/
package deepak;

import java.util.Arrays;
import java.util.Scanner;


public class Assignment62_ScannerSumUsingExcptnHandling {
	int getSum(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			try {
				sum = sum + Integer.parseInt(arr[index]);
			} catch (NumberFormatException nfe) {
				//Blank Catch added just to handle exception
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment62_ScannerSumUsingExcptnHandling output = new Assignment62_ScannerSumUsingExcptnHandling();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input statement.");
		String input = sc.nextLine();
		System.out.println("Output : " + output.getSum(input));
	}
}
