//Assignment - 61 : 21st Oct'2023
//Take 2 valid numbers from user using scanner class and use exception handling mechanims.

package pushpa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input1 = 0, input2 = 0;
		while (true) {
			try {
				System.out.println("Enter first Number");
				input1 = scanner.nextInt();
				System.out.println("Enter second Number");
				input2 = scanner.nextInt();
				break;
			} catch (InputMismatchException inputMismatchException) {
				scanner.next();
				System.out.println("Input mismatched. Please enter valid input");
			}
		}
		System.out.println("Entered Numbers are :" + input1 + " " + input2);
		scanner.close();
	}

}
