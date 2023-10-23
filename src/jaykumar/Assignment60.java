/*Assignment - 60 : 21st Oct'2023
Using scanner class, print digit sum of each name.
input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4*/

package jaykumar;

import java.util.Scanner;

public class Assignment60 {
	
	void splitString(String input) {
		String[] arr = input.split(" ");
		System.out.println("Sum of digits in each string is as follows: ");
		for(int index=0; index<arr.length; index++) {
			this.processString(arr[index]);
		}
	}
	
	void processString(String input) {
		int sum = 0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(input+" -> "+sum);
	}
	
	

	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give input string: ");
		String input = sc.nextLine();
		assignment60.splitString(input);
		sc.close();
	}
}
