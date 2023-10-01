/*Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}*/
package shrutika;

import java.util.Arrays;

public class ArrySwapA36 {

	void swapArry(String[] input) {
		System.out.println("Before = " + Arrays.toString(input));
		String temp = "";
		temp = input[0];
		input[0] = input[input.length - 1];
		input[input.length - 1] = temp;
		System.out.println("After = " + Arrays.toString(input));
	}

	public static void main(String[] args) {
		String[] ArrInput = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		ArrySwapA36 arrySwapA36 = new ArrySwapA36();
		arrySwapA36.swapArry(ArrInput);
	}
}
