/* WAP to Return freq of each number in a given array.

input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 2
         11 -> 2 		 
		 19 -> 1
         20 -> 4 */

package sayali;

import java.util.Map;
import java.util.LinkedHashMap;

public class Assignment85 {

	static Map<Integer, Integer> getNumFreq(int[] numArray) {
		Map<Integer, Integer> mapOfNumber = new LinkedHashMap<Integer, Integer>();
		for (Integer num : numArray) {
			if (mapOfNumber.containsKey(num)) {
				int count = mapOfNumber.get(num);
				mapOfNumber.put(num, count + 1);
			} else {
				mapOfNumber.put(num, 1);
			}
		}
		return mapOfNumber;
	}

	public static void main(String[] args) {
		int[] numArray = { 10, 20, 10, 11, 19, 11, 20, 20, 20 };
		System.out.println(getNumFreq(numArray));
	}
}