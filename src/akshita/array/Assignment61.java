//Take 2 valid numbers from user using scanner class and use exception handling mechanism.

package akshita.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment61 {

	void m1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Enter First number");
				int x = sc.nextInt();
				System.out.println("Enter Second number");
				int y = sc.nextInt();
				int output = x / y;
				System.out.println("Output : " + output);

			}
			catch (InputMismatchException im) {
				//System.out.println(im.getMessage());
				System.out.println("Please enter valid Number");
			} catch (ArithmeticException ae) {
			  // ae.printStackTrace(); //Print stacktrace after handling exception
				//System.out.println(ae.getMessage()); // Print exception message
				System.out.println("Arithematic Exception , Plz enter valid number");
			}
			System.out.println("exist");
			System.out.println("Would like to continue (Yes/No) ?");
			String temp = sc.next();
			if (temp.equals("No")) {
				break;
			}
			continue;
		}
	}

	public static void main(String[] args) {
		Assignment61 ass61 = new Assignment61();
		System.out.println("Start");
		ass61.m1();
	}
}
