/*
 Assignment-85 : 5th Nov'2023
Return freq of each number in a given array.

input : {10,20,10,11,19,11,20,20,20}
output : 10 -> 1
         11 -> 1 		 
		 19 -> 1
         20 -> 4
 */

package jyoti_CollectionFrameWork;

import java.util.Map;
import java.util.TreeMap;

public class Assignment85 {

	Map<Integer,Integer> findNumFreq (int[] input){
			Map<Integer,Integer>numMap=new TreeMap<Integer,Integer>();
			for(int num : input) {
				if(numMap.containsKey(num)) {
					numMap.put(num,numMap.get(num));
					numMap.put(num, numMap.get(num)+1);
				}else {
					numMap.put(num, 1);
				}
			}
		return numMap;
		
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 10, 11, 19, 11, 20, 20, 20 };
		Assignment85 ass = new Assignment85();
		System.out.println("Number frequency are-->"+ass.findNumFreq(input));
	}
}
