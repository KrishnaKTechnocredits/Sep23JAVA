//Write a program to print freq of each number using ArrayList.
//
//input : {10,20,10,10,11,11,13}
//output : 10 -> 3
//         20 -> 1
//		 11 -> 2
//		 13 -> 1

package pushpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {

	public void countFreqOfNumber(ArrayList<Integer> arrayList) {
		while (arrayList.size() > 0) {
			Integer no = arrayList.get(0);
			int count = 0;
			while (arrayList.contains(no)) {
				count++;
				arrayList.remove(no);
			}
			System.out.println(no + " -> " + count);
		}
	}

	public static void main(String[] args) {
		Integer arr[] = { 10, 20, 10, 10, 11, 11, 13 };
		ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(arr));
		new Assignment79().countFreqOfNumber(arrayList);
	}
}
