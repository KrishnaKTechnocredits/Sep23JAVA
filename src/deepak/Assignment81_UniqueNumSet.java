/*Assignment-81 : 4th Nov'2023

Return unique set of number from all given numbers.

input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67]
*/

package deepak;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment81_UniqueNumSet {

	Set<Integer> getUniqueNumSet(Integer[] input) {
		System.out.println("Input : " + Arrays.toString(input));
		Set<Integer> output = new LinkedHashSet<Integer>();
		for (int num : input) {
			output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment81_UniqueNumSet output = new Assignment81_UniqueNumSet();
		Integer[] arr = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		System.out.println("Output : " + output.getUniqueNumSet(arr));
	}
}
