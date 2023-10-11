/* Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89 */

package sayali;

import java.util.Arrays;

public class Assignment50 {
	int temp;

	void findSecondMaxAge(int[] input) {

		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		System.out.println("Given Array is: " + (Arrays.toString(input)));
		System.out.println("Second max age from given array is: " + (input[input.length - 2]));
	}

	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		int[] age = { 13, 45, 2, 48, 89, 11, 19, 91 };
		assignment50.findSecondMaxAge(age);
	}
}