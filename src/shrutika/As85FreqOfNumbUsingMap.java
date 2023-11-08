/*Assignment-85 : 5th Nov'2023
Return freq of each number in a given array.
input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 2
         11 -> 2		 
		 19 -> 1
         20 -> 4*/
package shrutika;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class As85FreqOfNumbUsingMap {

	Map<Integer, Integer> getFreqOfNumber(int[] input) {
		System.out.println("Input : " + Arrays.toString(input));
		Map<Integer, Integer> output = new LinkedHashMap<>();
		for (Integer num : input) {
			if (output.containsKey(num)) {
				output.put(num, output.get(num) + 1);
			} else {
				output.put(num, 1);
			}
		}
		return output;
	}

	void printFreqOfNumber(Map<Integer, Integer> input) {
		System.out.println("Output : ");
		Set<Integer> keys = input.keySet();
		for (Integer num : keys) {
			System.out.println(num + " -> " + input.get(num));
		}
	}

	public static void main(String[] args) {
		As85FreqOfNumbUsingMap as85 = new As85FreqOfNumbUsingMap();
		int[] input = { 10, 20, 10, 11, 19, 11, 20, 20, 20 };
		Map<Integer, Integer> numMap = as85.getFreqOfNumber(input);
		as85.printFreqOfNumber(numMap);
	}
}
