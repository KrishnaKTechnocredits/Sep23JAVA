/*Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}*/

package mohit;

import java.util.Arrays;

public class Assignment_36 {

	void swapElements(String[] input) {
		System.out.println("Input" + ":" + Arrays.toString(input));
		String temp = input[0];// sayali
		input[0] = input[input.length - 1];// yogesh
		input[input.length - 1] = temp;// sayali
		System.out.println("Output" + ":" +Arrays.toString(input));
	}

	public static void main(String[] args) {
		Assignment_36 assignment_36 = new Assignment_36();
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment_36.swapElements(input);

	}

}
