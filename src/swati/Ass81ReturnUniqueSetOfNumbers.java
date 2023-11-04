/*Assignment-81 : 4th Nov'2023

Return unique set of number from all given numbers.

input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67]*/
package swati;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Ass81ReturnUniqueSetOfNumbers {

	void printUniqueSetOFNumbers(LinkedHashSet<Integer> input) {
		for (int num : input) {
			input.add(num);
		}
		System.out.println("unique set of number from all given numbers : " + input);
	}

	public static void main(String[] args) {
		Ass81ReturnUniqueSetOfNumbers ass81 = new Ass81ReturnUniqueSetOfNumbers();
		LinkedHashSet<Integer> setOfNumbers = new LinkedHashSet<Integer>(
				Arrays.asList(10, 11, 10, 44, 55, 4, 55, 66, 67));
		ass81.printUniqueSetOFNumbers(setOfNumbers);
	}
}
