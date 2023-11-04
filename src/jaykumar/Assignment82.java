/*Assignment-82 : 4th Nov'2023
Return all duplicate number from all given numbers in appropiate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55]*/

package jaykumar;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment82 {
	
	LinkedHashSet<Integer> getDuplicateNum(int[] arr){
		LinkedHashSet<Integer> setOfNum = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> temp = new LinkedHashSet<Integer>();
		for(int num : arr) {
			if(!temp.add(num)) {
				setOfNum.add(num);
			}
		}
		return setOfNum;
	}

	public static void main(String[] args) {
		int[] arr = {10,11,10,44,55,4,55,66,67};
		System.out.println("Given Numbers: "+Arrays.toString(arr));
		System.out.println("Duplicate Numbers: "+new Assignment82().getDuplicateNum(arr));
	}
}
