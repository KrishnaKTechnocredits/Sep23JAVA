//Assignment-73 : 1st Nov'2023
//
//Insert number 100 at the index of first negative number.
//
//input : [13,44,67,-22,14,55,-44,12,-3]
//output : [13,44,67,100,-22,14,55,-44,12,-3]

package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment73 {

	void addNum(ArrayList<Integer> input) {
		System.out.println(input);
		for (int i = 0; i < input.size(); i++) {
			int num = input.get(i);
			if (num < 0) {
				input.add(i, 100);
				break;
			}
		}
		System.out.println(input);

	}

	public static void main(String[] args) {
		Yogesh_Assignment73 assignment73 = new Yogesh_Assignment73();
		ArrayList<Integer> num = new ArrayList<>();
		num.add(13);
		num.add(44);
		num.add(67);
		num.add(-22);
		num.add(14);
		num.add(55);
		num.add(-44);
		num.add(12);
		num.add(-3);
		assignment73.addNum(num);

	}

}
