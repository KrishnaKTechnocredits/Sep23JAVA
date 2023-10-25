/*Assignment - 61 : 21st Oct'2023
Take 2 valid numbers from user using scanner class and use exception handling mechanims.*/
package shrutika;

import java.util.InputMismatchException;
import java.util.Scanner;

public class As61ScannerWithException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			try {
				System.out.println("Enter First number");
				num1 = sc.nextInt();
				System.out.println("Enter Second number");
				num2 = sc.nextInt();
				break;
			} catch (InputMismatchException ie) {
				sc.next();
				System.out.println("Enter valid number");
			}
		}
		System.out.println("First number is -> " + num1 + "\nSecond number is -> " + num2);
		sc.close();
	}
}
