//Assignment - 49 : 8th Oct'2023
//Find the difference between age of yongest and eldest family member.
//int[] age = {13,45,2,48,89,91};
//output : (91-2) 89

package pushpa;

import java.util.Scanner;

public class Assignment49 {

	public void printMinMaxLength(int input[]) {
		int min = input[0], max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min)
				min = input[i];

			if (input[i] > min)
				max = input[i];
		}
		System.out.println("(" + max + "-" + min + ") " + (max - min));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[6];
		System.out.println("Enter Age: ");
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		Assignment49 assignment49 = new Assignment49();
		assignment49.printMinMaxLength(input);
		scanner.close();
	}

}
