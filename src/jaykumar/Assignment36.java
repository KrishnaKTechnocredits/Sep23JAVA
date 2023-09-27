/*Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}*/

package jaykumar;

import java.util.Arrays;

public class Assignment36 {

	void swapElements(String[] input) {
		System.out.println("Before: "+Arrays.toString(input));
		String str1 = input[0];
		input[0] = input[input.length-1];
		input[input.length-1] = str1;
		System.out.println("After: "+Arrays.toString(input));
		}
	
	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		String[] input = { "Sayli", "deepak", "Nivedita", "Yogesh"};
		assignment36.swapElements(input);
	}
}
