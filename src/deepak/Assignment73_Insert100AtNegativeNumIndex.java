/*
Assignment-73 : 1st Nov'2023

Insert number 100 at the index of first negative number.

input : [13,44,67,-22,14,55,-44,12,-3]
output : [13,44,67,100,-22,14,55,-44,12,-3]

if(listOfNames.indexOf("Sakshi")>=0){ // Valid index, name is available
	
}
------------------------------------
*/

package deepak;

import java.util.ArrayList;

public class Assignment73_Insert100AtNegativeNumIndex {

	ArrayList<Integer> insert100(ArrayList<Integer> input) {
		System.out.println("Input : " + input);
		for (int index = 0; index < input.size(); index++) {
			int num = input.get(index);
			if (num < 0) {
				input.add(index, 100);
				break;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment73_Insert100AtNegativeNumIndex output = new Assignment73_Insert100AtNegativeNumIndex();
		ArrayList<Integer> input = new ArrayList<>();
		input.add(13);
		input.add(44);
		input.add(67);
		input.add(-22);
		input.add(14);
		input.add(55);
		input.add(-44);
		input.add(12);
		input.add(-3);
		System.out.println("Output : " + output.insert100(input));
	}
}