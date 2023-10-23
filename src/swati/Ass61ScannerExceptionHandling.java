/*Assignment - 61 : 21st Oct'2023 Take 2 valid numbers from user using scanner 
 * class and use exception handling mechanims.
*/
package swati;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass61ScannerExceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = 0;
		int input2 = 0;
		while (true) {
			try {
				System.out.println("Enter first numbers");
				input1 = sc.nextInt();
				System.out.println("Enter second numbers");
				input2 = sc.nextInt();
				break;
			} catch (InputMismatchException ie) {
				sc.next();
				System.out.println("Please provide valid input");
			}
		}
		System.out.println("Accepted numbers are " + input1 + " and " + input2);
		sc.close();
	}
}
