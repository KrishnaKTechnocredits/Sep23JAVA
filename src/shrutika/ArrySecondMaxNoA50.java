/*Assignment - 50 : 8th Oct'2023
Find the second max from given array.
int[] age = {13,45,2,48,89,11,19,91};
output : 89 */
package shrutika;

import java.util.Arrays;

public class ArrySecondMaxNoA50 {

	int[] ascendingOrder(int[] arry) {
		int temp = 0;
		for (int index = 0; index < arry.length; index++) {
			for (int innerIndex = 0; innerIndex < arry.length; innerIndex++) {
				if (arry[index] < arry[innerIndex]) {
					temp = arry[index];
					arry[index] = arry[innerIndex];
					arry[innerIndex] = temp;
				}
			}
		}
		return arry;
	}

	void array(int[] array, int input) { // this approach user want nth largest number
		for (int index = 0; index < array.length; index++) {
			ascendingOrder(array);
		}
		System.out.println(Arrays.toString(array));
		System.out.println(input + "rd Largetst Number is -> " + array[array.length - input]);
	}

	void secondMaxNum(int[] input) { // this approach is easy if user want 2nd largest number
		int maxNum = 0;
		int secodMax = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > maxNum) {
				secodMax = maxNum;
				maxNum = input[index];
			}
		}
		System.out.println("Second Largest number in given array is -> " + secodMax);
	}

	public static void main(String[] args) {
		ArrySecondMaxNoA50 arrySecondMaxNoA50 = new ArrySecondMaxNoA50();
		int[] input = { 13, 45, 2, 48, 89, 11, 19, 91 };
		arrySecondMaxNoA50.array(input, 3);
		arrySecondMaxNoA50.secondMaxNum(input);
	}
}
