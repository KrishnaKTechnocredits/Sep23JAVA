/*Using scanner class, print digit sum of each name.

input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4*/

package onkar;

import java.util.Scanner;

public class Assignment60 {
	
	void processString(String input) {
		String[] arr = input.split(" ");
		for (int index=0; index<arr.length; index++) {
			int sum = findSumOfDigits(arr[index]);
			System.out.println(arr[index]+" -> "+sum);
		}
	}
	
	int findSumOfDigits(String input) {
		int sum = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to process :");
		String input = sc.nextLine();
		new Assignment60().processString(input);
	}
}
