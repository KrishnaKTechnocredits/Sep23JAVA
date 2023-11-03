//Assignment-73 : 1st Nov'2023
//
//Insert number 100 at the index of first negative number.
//
//input : [13,44,67,-22,14,55,-44,12,-3]
//output : [13,44,67,100,-22,14,55,-44,12,-3]

package pushpa;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment73 {

	public ArrayList<Integer> addElementInArrayList(ArrayList<Integer> arrayList) {
		System.out.println(arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			int index = arrayList.get(i);
			if (index < 0) {
				arrayList.add(i, 100);
				break;
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		Assignment73 assignment73 = new Assignment73();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(13);
		arrayList.add(44);
		arrayList.add(67);
		arrayList.add(-22);
		arrayList.add(14);
		arrayList.add(55);
		arrayList.add(-44);
		arrayList.add(12);
		arrayList.add(-3);
		ArrayList<Integer> updatedArrayList = assignment73.addElementInArrayList(arrayList);
		System.out.println(updatedArrayList);
	}
}
