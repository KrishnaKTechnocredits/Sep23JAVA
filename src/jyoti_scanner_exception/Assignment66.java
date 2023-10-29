/*WAP to reverse a number
 * input=123
 * output=321
 */

package jyoti_scanner_exception;

import java.util.Scanner;

public class Assignment66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please entrer the Number");
			int num = sc.nextInt();
			System.out.println("Original Number-->" + num);
			int rev = 0;
			while (num != 0) {
				int rem = num % 10;
				rev = rev * 10 + rem;
				num = num / 10;
			}
			System.out.println("Reversed number--->" + rev);
			System.out.println("Would you like to continue Yes/No");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
		}
		sc.close();
	}
}
