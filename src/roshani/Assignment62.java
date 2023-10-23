/*Assignment - 62 : 21st Oct'2023
Using exception handling write below code.

String str = "I have total 9 years and 2 months of experience";
output : 11

String[] word = str.split(" ");
sum =  sum + Integer.parseInt(word)
*/
package roshani;

import java.util.Scanner;

public class Assignment62{
	
	void splitString(String input){
		int sum = 0;
		String[] arr = input.split(" ");
		for(int index = 0; index < arr.length; index++){
			try{
				sum = sum + Integer.parseInt(arr[index]);
			}catch(NumberFormatException ne){
				
			}
		}
		System.out.println("Sum of digits in given string is: " + sum);
	}
	
	public static void main(String[] args){
		Assignment62 assignment62 = new Assignment62();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String input = sc.nextLine();
		assignment62.splitString(input);
		sc.close();
	}
}