//*Using exception handling write below code.

//*String str = "I have total 9 years and 2 months of experience";
//*output : 11



package hetal;

import java.util.Scanner;

public class Assignment62 {

	void printSum(String[] input) {
		int sum = 0;
		for(int index = 0;index<input.length;index++) {
			try {
				sum = sum + Integer.parseInt(input[index]);
			}catch(NumberFormatException ne) {
				
			}
		}
		System.out.println("Sum in given String : "+sum);
	}
	
	public static void main(String[] args) {
		Assignment62 a = new Assignment62();
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] input = x.split(" ");
		a.printSum(input);
		sc.close();
	}
}
