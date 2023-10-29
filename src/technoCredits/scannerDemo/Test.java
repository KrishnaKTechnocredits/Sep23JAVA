package technoCredits.scannerDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

class Test {

	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}

	public static void main(String[] args) {
		Test test = new Test();
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		while(true){
			try {
				System.out.println("Enter first number : ");
				num1 = sc.nextInt();
				System.out.println("Enter second number : ");
				num2 = sc.nextInt();
				break;
			}catch(InputMismatchException ie) {
				String temp = sc.nextLine();
				System.out.println(temp);
				System.out.println("Please provide both correct number");
			}
		}
		test.add(num1, num2);
		sc.close();
	}

}