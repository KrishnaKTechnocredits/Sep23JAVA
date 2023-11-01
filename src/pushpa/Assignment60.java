
//Assignment - 60 : 21st Oct'2023
//
//Using scanner class, print digit sum of each name.
//
//input : Say2al1i Ad9it5ya Shr4utik2a Saks4hi
//output :  Say2al1i -> 3
//          Ad9it5ya -> 14
//		  Shr4utik2a -> 6
//		  Saks4hi -> 4

package pushpa;

import java.util.Scanner;

public class Assignment60 {

	public void printDigitSumOfName(String input[]) {
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input[i].length(); j++) {
				if (Character.isDigit(input[i].charAt(j)))
					sum += Character.getNumericValue(input[i].charAt(j));
			}
			System.out.println(input[i] + "->" + sum);
		}
	}

	public static void main(String[] args) {
		Assignment60 assignment60 = new Assignment60();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many elements you want ?");
		int size = scanner.nextInt();
		String input[] = new String[size];
		System.out.println("Enter Names");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.next();
		}
		assignment60.printDigitSumOfName(input);
		scanner.close();
	}

}
