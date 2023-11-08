/*
 Assignment-82 : 4th Nov'2023

Return all duplicate number from all given numbers in appropriate Data structure.
input : [10,11,10,44,55,4,55,66,67]
output : [10,55]
 */
package jyoti_CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment82 {
	public static void main(String[] args) {
		Integer[] numbers = { 10, 11, 10, 44, 55, 4, 55, 66, 67 };
		ArrayList<Integer> numberList1 = new ArrayList<Integer>(Arrays.asList(numbers));
		ArrayList<Integer> numberList2 = new ArrayList<Integer>();
		Set<Integer> list = new LinkedHashSet<Integer>();

		for (int index = 0; index < numberList1.size(); index++) {
			Integer i = numberList1.get(index);
			if (!list.add(i)) {
				numberList2.add(i);
			}
		}
		System.out.println(numberList2);
	}

}
