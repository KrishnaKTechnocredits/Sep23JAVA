/*Return all duplicate number from all given numbers in appropiate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55]*/

package onkar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment82 {
	
	ArrayList<Integer> duplicateNumbers1 (Integer[] arr){
		ArrayList<Integer> list = new ArrayList<Integer>();
		Set<Integer> uniqueNums = new LinkedHashSet<Integer>();
		for (int num:arr) {
			if(!uniqueNums.add(num))
				list.add(num);
		}
		return list;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,11,10,44,55,4,55,66,67};
		System.out.println("Orriginal array : "+Arrays.toString(arr));
		System.out.println("Duplicate numbers from the given array are : "+new Assignment82().duplicateNumbers1(arr));
	}
}
