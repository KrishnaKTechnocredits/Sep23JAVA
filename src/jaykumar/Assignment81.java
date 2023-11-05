/*Assignment-81 : 4th Nov'2023
Return unique set of number from all given numbers.
input : [10,11,10,44,55,4,55,66,67]
output : [10,11,44,55,4,66,67]*/

package jaykumar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Assignment81 {
	
	LinkedHashSet<Integer> getUniqueSet(int[] arr){
		System.out.println("Solution 1: Using LinkedHashSet");
		LinkedHashSet<Integer> setOfNum = new LinkedHashSet<Integer>();
		for(int num : arr) {
			setOfNum.add(num);
		}
		return setOfNum;
	}
	
	ArrayList<Integer> getUniqueList(int[] arr){
		System.out.println("Solution 2: Using ArrayList");
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		for(int num : arr) {
			if(!listOfNum.contains(num)) {
				listOfNum.add(num);
			}
		}
		return listOfNum;
	}
	
	LinkedHashSet<Integer> getUniqueSetInteger(Integer[] arr){
		System.out.println("Solution 3: Using LinkedHashSet and Integer");
		LinkedHashSet<Integer> setOfNum = new LinkedHashSet<Integer>(Arrays.asList(arr));
		return setOfNum;
	}

	public static void main(String[] args) {
		int[] arr = {10,11,10,44,55,4,55,66,67};
		System.out.println("Given Numbers: "+Arrays.toString(arr));
		Assignment81 a = new Assignment81();
		System.out.println(a.getUniqueSet(arr));
		System.out.println(a.getUniqueList(arr));
		Integer[] integerArr = {10,11,10,44,55,4,55,66,67};
		System.out.println(a.getUniqueSetInteger(integerArr));
	}
}
