/*Assignment - 49 : 8th Oct'2023

Find the difference between age of yongest and eldest family member.
int[] age = {13,45,2,48,89,91};
output : (91-2) 89
*/

package deepak;

import java.util.Arrays;

public class Assignment49_Array6 {
	int getMaxAge(int[] input) {
		int max = input[0];
		for (int index = 0; index < input.length; index++) {
			if (max < input[index]) {
				max = input[index];
			}
		}
		return max;
	}

	int getMinAge(int[] input) {
		int min = input[0];
		for (int index = 0; index < input.length; index++) {
			if (min > input[index]) {
				min = input[index];
			}
		}
		return min;
	}

	int getAgeDifference(int[] input) {
		System.out.println("Input :" + Arrays.toString(input));
		int difference = 0;
		int maxAge = getMaxAge(input);
		int minAge = getMinAge(input);
		difference = maxAge - minAge;
		return difference;
	}

	public static void main(String[] args) {
		Assignment49_Array6 output = new Assignment49_Array6();
		int[] age = { 13, 45, 2, 48, 89, 91 };
		System.out.println("Differnce between Maximum and Minimum age is : " + output.getAgeDifference(age));
	}
}
