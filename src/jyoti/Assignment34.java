/*Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}//10+44=54 ,3+33+35=71
output : 17
*/

package jyoti;

public class Assignment34 {

	int printDifference(int[] arr) {
		int diff = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evenSum += arr[index];
			} else if (arr[index] % 2 != 0) {
				oddSum += arr[index];
			}
		}
		if (oddSum > evenSum) {
			diff = oddSum - evenSum;
		} else if (oddSum < evenSum) {
			diff = evenSum - oddSum;
		}
		return diff;
	}

	public static void main(String[] args) {
		int[] input = { 10, 3, 44, 33, 35 };
		Assignment34 as = new Assignment34();
		int result = as.printDifference(input);
		System.out.println("Difference of given numbers are-->" + result);
	}

}
