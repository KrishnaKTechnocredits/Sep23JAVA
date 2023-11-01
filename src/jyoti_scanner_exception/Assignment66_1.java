/*WAP to reverse a number
 * input=123
 * output=321
 */

package jyoti_scanner_exception;

import java.util.Scanner;

public class Assignment66_1 {

	int getReverseNumber(int num) {
		int rev = 0;
		while (num != 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Assignment66_1 ass = new Assignment66_1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please entrer the Number");
			int num = sc.nextInt();
			System.out.println("Original Number-->" + num);
			System.out.println("Reversed number--->" + ass.getReverseNumber(num));
			System.out.println("Would you like to continue Yes/No");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
		}

		sc.close();
	}
}
