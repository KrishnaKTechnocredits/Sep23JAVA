//*Take 2 valid numbers from user using scanner class and use exception handling mechanims.

package hetal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {

	void add(int num1, int num2) {
		int add = num1 + num2;
		System.out.println("addition is " + add);
	}

	public static void main(String[] args) {
		Assignment61 a = new Assignment61();
		Scanner sc = new Scanner(System.in);
		int num1=0;
		int num2=0;
		while(true) {
			try {
				System.out.println("Enter first number : ");
				num1 = sc.nextInt();
				System.out.println("Enter second number : ");
				num2 = sc.nextInt();
				break;
			}catch(InputMismatchException ie) {
				sc.next();
				System.out.println("please provide both correct number");
			}
		}
		a.add(num1, num2);
	}

}
