package denish;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment61 {

	void processData() {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		while (true) {
			try {
				System.out.println("Enter 1st number: ");
				num1 = sc.nextInt();
				System.out.println("Enter 2nd number: ");
				num2 = sc.nextInt();
				break;
			} catch (InputMismatchException ie) {
				sc.next();
				System.out.println("Please enter valid numbers:");
			}
		}
		System.out.println("Numbers given are: " + num1 + " and " + num2);
		sc.close();
	}

	public static void main(String[] args) {
		Assignment61 assignment61 = new Assignment61();
		assignment61.processData();
	}
}
