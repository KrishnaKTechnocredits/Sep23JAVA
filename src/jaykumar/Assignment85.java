/*Assignment-85 : 5th Nov'2023
Return freq of each number in a given array.
input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 1
         11 -> 1 		 
		 19 -> 1
         20 -> 4*/

package jaykumar;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment85 {
	
	Map<Integer, Integer> getNumFreq(int[] arr){
		Map<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
		for(int num : arr) {
			if(numMap.containsKey(num)) {
				numMap.put(num, numMap.get(num)+1);
			}else {
				numMap.put(num, 1);
			}
		}
		return numMap;
	}
	
	void printNumFreq(Map<Integer, Integer> numMap) {
		Set<Integer> keySet = numMap.keySet();
		for(int num : keySet) {
			System.out.println(num+" -> "+numMap.get(num));
		}
	}

	public static void main(String[] args) {
		Assignment85 a = new Assignment85();
		int[] arr = {10,20,10,11,19,11,20,20,20};
		System.out.println("Frequency of number in given array: ");
		a.printNumFreq(a.getNumFreq(arr));
	}
}
