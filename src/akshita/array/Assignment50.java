
package akshita.array;

import java.util.Arrays;

public class Assignment50 {

	void secondMax(int[] input) {
		Arrays.sort(input);
		System.out.println("Using default method");
		System.out.println(Arrays.toString(input));
		System.out.println(input[input.length-2]);
	}
	
	void max(int[] input) {
		int temp = 0;
		for (int index = 0; index < input.length; index++) {
			for (int iIndex = index + 1; iIndex < input.length; iIndex++) {
				if (input[index] < input[iIndex]) {
					temp = input[index];
					input[index] = input[iIndex];
					input[iIndex] = temp;
				}
			}
		}
		System.out.println("Using sorting method");
		System.out.println(Arrays.toString(input));
		System.out.println(input[1]);
	}

	public static void main(String[] args) {
		Assignment50 ass50 = new Assignment50();
		int[] arr = { 13, 45, 2, 48, 89, 11, 19, 91 };
		System.out.println("Find second max from given array");
		ass50.max(arr);
		ass50.secondMax(arr);
	}
}