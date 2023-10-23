/*Assignment - 60 : 21st Oct'2023

Using scanner class, print digit sum of each name.

input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4
*/
package roshani;

import java.util.Arrays;
import java.util.Scanner;

public class Ass60DigitSum{
	
	void digitSum(String input) {
		int sum = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum= sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(input + "->" + sum);
	}

	void processString(String input) {
		System.out.println("Sum of digit from string :  ");
		String[] arr = input.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println("\n");
		for(int index=0 ; index < arr.length; index++) {
			digitSum(arr[index]);
		}	
	}

	public static void main(String[] args) {
		Ass60DigitSum assignment60 = new Ass60DigitSum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String str = sc.nextLine();	
		System.out.println("=======================================");
		assignment60.processString(str);
		sc.close();
	}
}		  