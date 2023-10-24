package naresh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignemt61 {
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		while(true) {
		try {
		System.out.println("Enter first number :");
		 num1 = sc.nextInt();
		System.out.println("Enter second number :");
		 num2 = sc.nextInt();
		break;
		}
		catch(InputMismatchException ie) {
			sc.next();
			System.out.println("Please enter valid number");
		}
			
		}
		System.out.println(num1+"&"+num2);
		sc.close();
	}
	
}


