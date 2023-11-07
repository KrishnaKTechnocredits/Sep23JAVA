//Assignment-81 : 4th Nov'2023
//
//Return unique set of number from all given numbers.
//
//input : [10,11,10,44,55,4,55,66,67]
//output : [10,11,44,55,4,66,67]
package yogesh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Yogesh_Assignment81 {

	Set<Integer> getUniqueNum(Integer[] num) {
		System.out.println("Input is:--"+Arrays.toString(num));
		Set<Integer> hs = new LinkedHashSet<Integer>();
		for (Integer input : num) {
			hs.add(input);
		}
		return hs;
	}

	public static void main(String[] args) {
		Yogesh_Assignment81 assignment81 = new Yogesh_Assignment81();
		Integer[] input = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		System.out.println("Output:--" + assignment81.getUniqueNum(input));
	}

}
