/*Assignment-73 : 1st Nov'2023

Insert number 100 at the index of first negative number.

input : [13,44,67,-22,14,55,-44,12,-3]
output : [13,44,67,100,-22,14,55,-44,12,-3]*/
package denish;

import java.util.ArrayList;

public class Assignment73 {

	ArrayList<Integer> insertNumber(ArrayList<Integer> input) {
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
		ArrayList<Integer> listOfNames = new ArrayList<Integer>();
		listOfNames.add(13);
		listOfNames.add(44);
		listOfNames.add(67);
		listOfNames.add(-22);
		listOfNames.add(14);
		listOfNames.add(55);
		listOfNames.add(-44);
		listOfNames.add(12);
		listOfNames.add(-3);

		Assignment73 ass = new Assignment73();
		System.out.println("output is " + ass.insertNumber(listOfNames));
	}
}
