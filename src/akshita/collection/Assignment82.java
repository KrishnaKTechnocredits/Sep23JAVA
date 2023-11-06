/*  Return all duplicate number from all given numbers in appropiate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55] */

package akshita.collection;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment82 {

	public static void main(String[] args) {
		Integer[] arr = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> output = new LinkedHashSet<Integer>();
		for (int num : arr) {
			if (!hs.add(num)) {
				output.add(num);
			}
		}
		System.out.println("Return all duplicate number");
		System.out.println("Input : " + Arrays.asList(arr));
		System.out.println("Output : " + output);
	}
}
