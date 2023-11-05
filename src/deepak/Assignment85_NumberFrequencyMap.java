/*Assignment-85 : 5th Nov'2023
Return freq of each number in a given array.

input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 1
         11 -> 1 		 
		 19 -> 1
         20 -> 4
*/

package deepak;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment85_NumberFrequencyMap {

	Map<Integer, Integer> getNumberFrequency(int[] input) {
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

	void printNumberFrequency(Map<Integer, Integer> input) {
		System.out.println("Output : ");
		Set<Integer> keys = input.keySet();
		for (Integer num : keys) {
			System.out.println(num + " -> " + input.get(num));
		}
	}

	public static void main(String[] args) {
		Assignment85_NumberFrequencyMap output = new Assignment85_NumberFrequencyMap();
		int[] input = { 10, 20, 10, 11, 19, 11, 20, 20, 20 };
		Map<Integer, Integer> numMap = output.getNumberFrequency(input);
		output.printNumberFrequency(numMap);

	}
}