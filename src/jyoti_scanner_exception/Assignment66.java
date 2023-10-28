/*WAP to reverse a number
 * input=123
 * output=321
 */

package jyoti_scanner_exception;

import java.util.Scanner;

public class Assignment66 {

	public static void main(String[] args) {
		Assignment66 ass = new Assignment66();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please entrer the Number");
			int num = sc.nextInt();

			System.out.println("Given Number-->" + num);

			int rev = 0;
			while (num != 0) {

				int rem = num % 10;// 3

				rev = rev * 10 + rem;// 3

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
