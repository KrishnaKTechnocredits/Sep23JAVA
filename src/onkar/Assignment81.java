/*Return unique set of number from all given numbers.

input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67]*/

package onkar;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment81 {
	
	LinkedHashSet<Integer> uniqueNums(Integer[] arr){
		LinkedHashSet<Integer> list = new LinkedHashSet<Integer>(Arrays.asList(arr));
		return list;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,11,10,44,55,4,55,66,67};
		System.out.println("Original list of number : "+Arrays.toString(arr));
		System.out.println("Unique number from given list are : "+new Assignment81().uniqueNums(arr));
	}
}
