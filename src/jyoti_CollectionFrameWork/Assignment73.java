/*
 Assignment-73 : 1st Nov'2023

Insert number 100 at the index of first negative number.

input : [13,44,67,-22,14,55,-44,12,-3]
output : [13,44,67,100,-22,14,55,-44,12,-3]

 */

package jyoti_CollectionFrameWork;

import java.util.ArrayList;

public class Assignment73 {

	ArrayList<Integer> insertNumber(ArrayList<Integer> input) {
		int negativeNum = 0;
		for (int index = 0; index < input.size(); index++) {
			int number = input.get(index);
			if (number < 0) {
				negativeNum = index;
				break;
			}
		}
		input.add(negativeNum, 100);
		return input;
	}

	public static void main(String[] args) {
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(13);
		intlist.add(44);
		intlist.add(67);
		intlist.add(-22);
		intlist.add(14);
		intlist.add(55);
		intlist.add(-44);
		intlist.add(12);
		intlist.add(-3);
		ArrayList<Integer> input = new Assignment73().insertNumber(intlist);
		System.out.println("Original list -->" + intlist);
		System.out.println("================================");
		System.out.println("output :" + input);

	}

}
