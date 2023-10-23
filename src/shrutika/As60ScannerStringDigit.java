/*Assignment - 60 : 21st Oct'2023

Using scanner class, print digit sum of each name.

input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4 */
package shrutika;

import java.util.Scanner;

public class As60ScannerStringDigit {

	void sumOfDigit(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(input + " -> " + sum);
	}

	public static void main(String[] args) {
		As60ScannerStringDigit as60ScannerStringDigit = new As60ScannerStringDigit();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String name = sc.nextLine();
		String[] arry = name.split(" ");
		System.out.println("Sum of Digit in given string are");
		for (int index = 0; index < arry.length; index++) {
			as60ScannerStringDigit.sumOfDigit(arry[index]);
		}
		sc.close();
	}
}
