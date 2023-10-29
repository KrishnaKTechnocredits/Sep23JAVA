/*Take 2 valid numbers from user using scanner class and use exception handling mechanism.
*/

package onkar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {
	
	void checkInputs() {
		int num1 = 0;
		int num2 = 0;
		for(;;) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Input first number : ");
				num1 = sc.nextInt();
				System.out.println("Input second number : ");
				num2 = sc.nextInt();
				sc.close();
				break;
			}catch(InputMismatchException ime){
				System.out.println("Input numbers only");
			}
		}
		System.out.println("Given number in the console are :"+num1+" & "+num2);
	}
	
	public static void main(String[] args) {
		new Assignment61().checkInputs();
	}
}
