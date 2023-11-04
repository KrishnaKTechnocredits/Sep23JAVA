/* WAP to Return all duplicate number from all given numbers in appropriate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55] */

package sayali;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment82 {

	Set<Integer> GetDuplicateNumbersSet(LinkedHashSet<Integer> input) {

		Integer[] arr = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		Set<Integer> hs = new LinkedHashSet<Integer>();
		Set<Integer> outputSet = new LinkedHashSet<Integer>();

		for (int num : arr) {
			if (!hs.add(num)) {
				outputSet.add(num);
			}
		}
		return outputSet;
	}

	public static void main(String[] args) {
		Assignment82 ass82 = new Assignment82();
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<Integer>(
				(Arrays.asList(10, 11, 10, 44, 55, 4, 55, 66, 67)));
		System.out.println("Output: " + ass82.GetDuplicateNumbersSet(setOfNumbers));
	}
}