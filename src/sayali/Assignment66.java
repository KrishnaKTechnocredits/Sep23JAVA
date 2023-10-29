/* WAP to return reverse number without converting it to String.
input : 123
output : 321 */

package sayali;

import java.util.Scanner;

public class Assignment66 {

	public static int reverseNum(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Output: " + reverseNum(number));
		sc.close();
	}
}
