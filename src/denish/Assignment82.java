/*Assignment-82 : 4th Nov'2023

Return all duplicate number from all given numbers in appropiate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55]*/
package denish;

import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment82 {

	Set<Integer> duplicateNumber(Integer[] arr) {
		Set<Integer> input = new LinkedHashSet<Integer>();
		Set<Integer> output = new LinkedHashSet<Integer>();
		for (int num : arr) {
			if (!input.add(num)) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		Assignment82 ass = new Assignment82();
		System.out.println(ass.duplicateNumber(arr));
	}
}
