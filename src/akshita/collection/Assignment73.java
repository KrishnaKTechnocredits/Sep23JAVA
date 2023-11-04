/*Insert number 100 at the index of first negative number.
input : [13,44,67,-22,14,55,-44,12,-3]
output : [13,44,67,100,-22,14,55,-44,12,-3]*/

package akshita.collection;

import java.util.ArrayList;

public class Assignment73 {

	ArrayList<Integer> insertNum(ArrayList<Integer> input) {
		System.out.println("Input : " + input);
		for (int index = 0; index < input.size(); index++) {
			if (input.get(index) < 0) {
				input.add(index, 100);
				break;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		System.out.println("Insert number 100 at the index of first negative number");
		Assignment73 ass73 = new Assignment73();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(13);
		al.add(44);
		al.add(67);
		al.add(-22);
		al.add(14);
		al.add(55);
		al.add(-44);
		al.add(12);
		al.add(-3);
		System.out.println("Output : " + ass73.insertNum(al));
	}
}
