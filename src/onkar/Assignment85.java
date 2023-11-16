/*Return freq of each number in a given array.

input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 1
         11 -> 1 		 
	 19 -> 1
         20 -> 4*/

package onkar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Assignment85 {
	
	Map<Integer, Integer> findFreq(Integer[] arr){
		Map<Integer, Integer> list = new LinkedHashMap<Integer, Integer>();
		for(int index=0; index<arr.length; index++) {
			Integer num = arr[index];
			if(list.containsKey(num)) {
				int count = list.get(num);
				list.put(num, ++count);
			}else {
				list.put(num, 1);
			}
		}
		return list;
	}
	
	void printFreq(Integer[] arr) {
		Map<Integer, Integer> list = findFreq(arr);
		System.out.println("LinkedHashMap in original format :");
		System.out.println(list+"\n");
		System.out.println("Output in required format :");
		Set<Integer> keys = list.keySet();
		for(int value : keys) {
			System.out.println(value+" -> "+list.get(value));
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,20,10,11,19,11,20,20,20};
		new Assignment85().printFreq(arr);
	}
}
