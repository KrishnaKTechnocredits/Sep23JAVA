/*Using exception handling write below code.

String str = "I have total 9 years and 2 months of experience";
output : 11

String[] word = str.split(" ");
sum =  sum + Integer.parseInt(word);*/

package onkar;

import java.util.Scanner;

public class Assignment62 {
	
	void printNumbersSumFromString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the string");
		String input = sc.nextLine();
		String[] arr = input.split(" ");
		int sum = 0;
		for (int index=0; index<arr.length; index++) {
			try {
				sum = sum + Integer.parseInt(arr[index]);
			}catch(NumberFormatException nfe){
				
			}
		}
		System.out.println("Sum of numbers in the given string is : "+sum);
		sc.close();
	}
	
	public static void main(String[] args) {
		new Assignment62().printNumbersSumFromString();
	}
}
