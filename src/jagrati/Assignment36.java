/*
 Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}
 */
package jagrati;

import java.util.Arrays;

public class Assignment36 {
	void swapOperation(String[] input) {
		System.out.println("Before swap operation " + Arrays.toString(input));
		String temp = input[0];
		input[0] = input[input.length - 1];
		input[input.length - 1] = temp;
		System.out.println("After swap operation " + Arrays.toString(input));
	}

	public static void main(String[] args) {
		String input[] = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		Assignment36 assign = new Assignment36();
		assign.swapOperation(input);

	}
}
