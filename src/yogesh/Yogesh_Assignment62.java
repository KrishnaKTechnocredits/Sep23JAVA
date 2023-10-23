//Assignment - 62 : 21st Oct'2023
//Using exception handling write below code.
//
//String str = "I have total 9 years and 2 months of experience";
//output : 11
package yogesh;

import java.util.Arrays;
import java.util.Scanner;

public class Yogesh_Assignment62 {

	void sumDigit(String[] input) {

		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			//char ch = input[index].charAt(index);
			try {
				sum = sum + Integer.parseInt(input[index]);
			} catch (NumberFormatException ne) {

			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Yogesh_Assignment62 assignment62 = new Yogesh_Assignment62();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:--");
		String str = sc.nextLine();
		String[] ar = str.split(" ");
		System.out.println(Arrays.toString(ar));
		System.out.println("Output is:--");
		assignment62.sumDigit(ar);
		sc.close();
	}
}
