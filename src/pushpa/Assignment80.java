//Assignment-80 : 3rd Nov'2023
//
//Write a program to print freq of each name using ArrayList.
//
//input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
//output : Techno -> 3
//         Credits -> 2
//		 Hello -> 1

package pushpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {

	public void countFreqOfNumber(ArrayList<String> arrayList) {
		while (arrayList.size() > 0) {
			String name = arrayList.get(0);
			int count = 0;
			while (arrayList.contains(name)) {
				count++;
				arrayList.remove(name);
			}
			System.out.println(name + " -> " + count);
		}
	}

	public static void main(String[] args) {
		String names[] = { "Techno", "Credits", "Techno", "Techno", "Hello","Credits" };
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(names));
		new Assignment80().countFreqOfNumber(arrayList);
	}
}
