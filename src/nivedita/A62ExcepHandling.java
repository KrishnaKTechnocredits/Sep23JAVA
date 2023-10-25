/*Assignment - 62 : 21st Oct'2023 Using exception handling write below code. 
String str = "I have total 9 years and 2 months of experience"; 
output : 11
 String[] word = str.split(" "); sum =  sum + Integer.parseInt(word);*/
 
package nivedita;

import java.util.Scanner;

public class A62ExcepHandling {
	void printSum(String input) {
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
		A62ExcepHandling excephan = new A62ExcepHandling();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input");
		String str = sc.nextLine();
		excephan.printSum(str);
		sc.close();
	}
}
