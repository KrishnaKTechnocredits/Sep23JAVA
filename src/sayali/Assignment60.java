/* WAP Using scanner class, print digit sum of each name.

input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
output :  Say2al1i -> 3
          Ad9it5ya -> 14
		  Shr4utik2a -> 6
		  Saks4hi -> 4 */

package sayali;

import java.util.Scanner;

public class Assignment60 {

	void printDigitSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		System.out.println(input + " -> " + sum);
	}

	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String name = sc.nextLine();
		String[] input = name.split(" ");
		System.out.println("Sum of digits of given input are as below: ");
		for (int index = 0; index < input.length; index++) {
			assignment60.printDigitSum(input[index]);
		}
		sc.close();
	}
}