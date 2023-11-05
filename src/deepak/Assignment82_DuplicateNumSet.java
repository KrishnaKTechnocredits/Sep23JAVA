/*Assignment-82 : 4th Nov'2023

Return all duplicate number from all given numbers in appropiate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55]
*/

package deepak;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment82_DuplicateNumSet {

	Set<Integer> getDuplicateNumSet(Integer[] input) {
		System.out.println("Input : " + Arrays.toString(input));
		Set<Integer> output = new LinkedHashSet<Integer>();
		Set<Integer> outputSet = new LinkedHashSet<Integer>();
		
		for (int num : input) {
			if(!output.add(num)){
				outputSet.add(num);
			}
		}
		return outputSet;
	}

	public static void main(String[] args) {
		Assignment82_DuplicateNumSet output = new Assignment82_DuplicateNumSet();
		Integer[] arr = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		System.out.println("Output : " + output.getDuplicateNumSet(arr));
	}
}