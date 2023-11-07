//Assignment-85 : 5th Nov'2023
//Return freq of each number in a given array.
//
//input : {10,20,10,11,19,11,20,20,20}
//output : 10 -> 1
//         11 -> 1 		 
//		 19 -> 1
//         20 -> 4

package pushpa;

import java.util.TreeMap;

public class Assignment85 {

	public TreeMap<Integer, Integer> getFreqOfNumber(int[] input) {
		TreeMap<Integer, Integer> hashMapNumbers = new TreeMap<Integer, Integer>();
		for (int i = 0; i < input.length; i++) {
			int no = input[i];
			if (hashMapNumbers.containsKey(no)) {
				int count = hashMapNumbers.get(no);
				hashMapNumbers.put(no, count + 1);
			} else {
				hashMapNumbers.put(no, 1);
			}
		}
		return hashMapNumbers;

	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 10, 11, 19, 11, 20, 20, 20 };
		TreeMap<Integer, Integer> hashMapNumbers = new Assignment85().getFreqOfNumber(input);
		System.out.println(hashMapNumbers);
	}
}
