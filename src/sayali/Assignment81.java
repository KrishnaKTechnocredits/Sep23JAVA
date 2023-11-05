/* WAP to Return unique set of number from all given numbers.
input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67] */

package sayali;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment81 {

	void printUniqueNumbersSet(LinkedHashSet<Integer> input) {
		for (int num : input) {
			input.add(num);
		}
		System.out.println("Output : " + input);
	}

	public static void main(String[] args) {
		Assignment81 ass81 = new Assignment81();
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<Integer>(
				(Arrays.asList(10, 11, 10, 44, 55, 4, 55, 66, 67)));
		System.out.println("Input: " + Arrays.asList(10, 11, 10, 44, 55, 4, 55, 66, 67));
		ass81.printUniqueNumbersSet(setOfNumbers);
	}
}