//Assignment-85 : 5th Nov'2023
//Return freq of each number in a given array.
//input : {10,20,10,11,19,11,20,20,20}
//output : 10 -> 2
//         11 -> 2		 
//		   19 -> 1
//         20 -> 4
package sakshi;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Arrays;

public class Assignment85{
	
	static Map<Integer,Integer> getNumberFreq(int[] numArray){
		Map<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
			for(Integer num:numArray){
			if(hm.containsKey(num)){
				int count = hm.get(num);
				hm.put(num,count+1);
			}else{
				hm.put(num,1);
			}
		}
		return hm;		
	}
	
	public static void main(String[] args){
		int[] numArray = {10,20,10,11,19,11,20,20,20};
		System.out.println(getNumberFreq(numArray));
	}
}