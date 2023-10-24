/*Assignment - 62 : 21st Oct'2023
Using exception handling write below code.

String str = "I have total 9 years and 2 months of experience";
output : 11

String[] word = str.split(" ");
sum =  sum + Integer.parseInt;
*/

package jyoti_scanner_exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment62 {

	void getSumDigit(String[] str) {
		
		int sum=0;
		for(int index=0;index<str.length;index++) {
			try {
				sum=sum+Integer.parseInt(str[index]);
			}
			catch(NumberFormatException ne){
				//System.out.println("Please check your data");
			}
		}System.out.println(sum);
	}
	
	

	public static void main(String[] args) {
		Assignment62 ass= new Assignment62();
		System.out.println("Please enter the string");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Output");
		System.out.println("=============================================");
		ass.getSumDigit(arr);
		sc.close();
	}
}