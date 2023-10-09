package deepak;

import java.util.Arrays;

/*Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89
*/

public class Assignment50_Array7 {
	int getMax(int[] input) {
		int max = input[0];
		for (int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
			}
		}
		return max;
	}

	void getSecondMax(int[] input) {
		System.out.println("Input : "+Arrays.toString(input));
		int max = getMax(input);
		for (int index = 0; index < input.length; index++) {
			if (max == input[index]) {
				input[index] = 0;
			}
		}
		System.out.println("Output : " + getMax(input));
	}
	
	public static void main(String[] args) {
		Assignment50_Array7 output = new Assignment50_Array7();
		int[] age = {13,45,2,48,89,11,19,91};
		output.getSecondMax(age);
	}
}
