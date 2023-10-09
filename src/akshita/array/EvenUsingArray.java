//WAP to print sum of all the even numbers from given array Input:{10,11,44,33,23}
//Output:54

package akshita.array;

import java.util.Arrays;

public class EvenUsingArray {

	int evenNum(int[] input) {
		int sum = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0) {
				sum = sum + input[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		EvenUsingArray evenUsingArray = new EvenUsingArray();
		System.out.println("Print sum os even number");

		int[] arr = { 10, 11, 44, 33, 23 };
		System.out.println("Input :" + Arrays.toString(arr));

		int output = evenUsingArray.evenNum(arr);
		System.out.println("Ouput: " + output);
	}

}

