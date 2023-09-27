//WAP  to return positive difference of all even number and odd number from given array.Input: {10,3,44,33,35}
//Output:17

package array;

import java.util.Arrays;

public class DiffEvenOdd {
	
	int getDiffEvenOdd(int[] input) {
		int esum=0;
		int osum=0;
		int diff=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]%2 ==0) {
				esum = esum + input[index];
			}
			else {
				osum = osum + input[index];
			}
		if(esum>osum) {
			diff =esum-osum;
		}
		else {
			diff =osum-esum;
		}
		}
		return diff;
	}

	public static void main(String[] args) {
		DiffEvenOdd diffEvenOdd = new DiffEvenOdd();
		System.out.println("Difference of all even number and odd number from given array");
		
		int[] arr = {10,3,44,33,35};
		System.out.println("Input : " + Arrays.toString(arr));
		
		System.out.println("Output" + diffEvenOdd.getDiffEvenOdd(arr));

	}

}
