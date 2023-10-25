/*Assignment - 62 : 21st Oct'2023
Using exception handling write below code.

String str = "I have total 9 years and 2 months of experience";
output : 11

String[] word = str.split(" ");
sum =  sum + Integer.parseInt(word); */
package shrutika;

import java.util.Scanner;

public class As62ExceptionHandling {

	void exception(String str) {
		int sum = 0;
		String[] word = str.split(" ");
		for (int index = 0; index < word.length; index++) {
			try {
				sum = sum + Integer.parseInt(word[index]);

			} catch (NumberFormatException ne) {
			}
		}
		System.out.println("Sum of digit in given String is -> " + sum);
	}

	public static void main(String[] args) {
		As62ExceptionHandling as62ExceptionHandling = new As62ExceptionHandling();
		// as62ExceptionHandling.exception("I have total 9 years and 2 months of
		// experience");
		Scanner sc = new Scanner(System.in);
		System.out.println("PleaseEnter the input");
		String str = sc.nextLine();
		as62ExceptionHandling.exception(str);
		sc.close();
	}
}
