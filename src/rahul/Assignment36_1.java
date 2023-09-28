/*Assignment-36 :  26th Sep'2023
Swap first and last element of an array, print it to confirm swap operation.
input :  { "Sayli", "deepak", "Nivedita", "Yogesh"}
output : { "Yogesh", "deepak", "Nivedita","Sayli"}*/

package rahul;

import java.util.Arrays;

public class Assignment36_1 {
	void swapFirstAndLastValue(String input[]) {
		String temp = "";
		String firstValue = "";
		String lastValue = "";
		firstValue = input[0];
		lastValue = input[input.length-1];
		temp = firstValue;
		firstValue = lastValue;
		lastValue = firstValue;
		input[0] = firstValue;
		input[input.length-1] = lastValue;
		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {
		Assignment36_1 assignment36_1 = new Assignment36_1();
		String str[] = { "Sayli", "deepak", "Nivedita", "Yogesh" };
		assignment36_1.swapFirstAndLastValue(str);
	}
}
