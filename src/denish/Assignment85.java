/*Assignment-85 : 5th Nov'2023
Return freq of each number in a given array.

input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 1
         11 -> 1 		 
		 19 -> 1
         20 -> 4*/
package denish;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment85 {

	Map<Integer, Integer> getNumFreq(int[] arr) {
		Map<Integer, Integer> numMap = new LinkedHashMap<Integer, Integer>();

		for (int num : arr) {
			if (numMap.containsKey(num)) {
				int count = numMap.get(num);
				numMap.put(num, count + 1);
			} else {
				numMap.put(num, 1);
			}
		}
		return numMap;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 10, 11, 19, 11, 20, 20, 20 };
		Assignment85 ass = new Assignment85();
		System.out.println(ass.getNumFreq(arr));
	}
}
