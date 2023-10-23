/*Assignment - 62 : 21st Oct'2023 Using exception handling write below code. 
String str = "I have total 9 years and 2 months of experience"; 
output : 11
 String[] word = str.split(" "); sum =  sum + Integer.parseInt(word);*/
package swati;

import java.util.Scanner;

public class Ass62UseScannerAndExceptionHanding {
	void calculateSum(String input) {
		int sum = 0;
		String[] word = input.split(" ");
		for (int index = 0; index < word.length; index++) {
			try {
				sum = sum + Integer.parseInt(word[index]);
			} catch (NumberFormatException ne) {}
		}
		System.out.println("Sum of digits in given input is "+sum);
	}

	public static void main(String[] args) {
		Ass62UseScannerAndExceptionHanding ass62 = new Ass62UseScannerAndExceptionHanding();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String str = sc.nextLine();
		ass62.calculateSum(str);
		sc.close();
	}
}
