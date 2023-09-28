/*
Assignment-34 :  26th Sep'2023
Return positive difference of sum of all the even numbers and odd numbers from given array.
input : {10,3,44,33,35}
output : 17
 */
package deepak;

import java.util.Arrays;

public class Assignment34_ArrayDifferenceOfSum {

	int eSum;
	int oSum;
	int diff;

	int getOddEvenSumDiff(int[] input) {
		for (int index = 0; index < input.length; index++) {
			if (input[index] % 2 == 0)
				eSum = eSum + input[index];
			else
				oSum = oSum + input[index];
		}
		if (eSum > oSum)
			return eSum - oSum;
		else if (eSum < oSum)
			return oSum - eSum;
		else
			return eSum - eSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment34_ArrayDifferenceOfSum getDiff = new Assignment34_ArrayDifferenceOfSum();
		int[] arr = { 10, 3, 44, 33, 35 };
		System.out.println("Input: " + Arrays.toString(arr));
		System.out.print("Output: ");
		System.out.println(getDiff.getOddEvenSumDiff(arr));
	}

}
