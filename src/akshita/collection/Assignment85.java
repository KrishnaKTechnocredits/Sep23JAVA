/* Return freq of each number in a given array.

input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 2
         11 -> 2		 
		 19 -> 1
         20 -> 4*/

package akshita.collection;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Assignment85 {

	public static void main(String[] args) {
		Map<Integer, Integer> hm = new TreeMap<Integer, Integer>();
		Integer[] input = { 10, 20, 10, 11, 19, 11, 20, 20, 20 };
		System.out.println("Input : " + Arrays.asList(input));
		for (Integer output : input) {
			if (hm.containsKey(output)) {
				hm.put(output, hm.get(output) + 1);
			} else 
				hm.put(output, 1);
		}
		System.out.println("Output : " + hm);
	}
}
