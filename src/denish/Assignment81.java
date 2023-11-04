/*Assignment-81 : 4th Nov'2023

Return unique set of number from all given numbers.

input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67]*/
package denish;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment81 {

	void uniquesNum(LinkedHashSet<Integer> input) {
		for (int num : input) {
			input.add(num);
		}
		System.out.println("Unique Number is : " + input);
	}

	public static void main(String[] args) {
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<Integer>(
				Arrays.asList(10, 11, 10, 44, 55, 4, 55, 66, 67));
		Assignment81 ass = new Assignment81();
		ass.uniquesNum(setOfNumbers);
	}
}
