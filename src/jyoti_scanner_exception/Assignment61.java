/*Assignment - 61 : 21st Oct'2023
Take 2 valid numbers from user using scanner class and use exception handling mechanims.
*/

package jyoti_scanner_exception;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {

	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		while(true) {
			try {
			System.out.println("Please enter number1");
			num1=sc.nextInt();
			System.out.println("Please enter number2");
			num2=sc.nextInt();
			break;
			}
			catch(InputMismatchException ie) {
				sc.next();
				System.out.println("Please check the entered data");
				
				
			}
			
		}
		System.out.println("You entered num1--->"+num1+ "--and Num2--"+num2);
		sc.close();
	}
}