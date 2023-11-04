//Assignment-80 : 3rd Nov'2023
//
//Write a program to print freq of each name using ArrayList.
//
//input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
//output : Techno -> 3
//         Credits -> 2
//		 Hello -> 1
package yogesh;

import java.util.ArrayList;
import java.util.Arrays;

public class Yogesh_Assignment80 {

	void freqOfEachName(ArrayList<String> name) {
		while (name.size() > 0) {
			String currentName = name.get(0);
			Integer count = 0;
			while (name.contains(currentName)) {
				name.remove(currentName);
				count++;
			}
			System.out.println(currentName + " -> " + count);
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment80 assignment80 = new Yogesh_Assignment80();
		String[] input = { "Techno", "Credits", "Techno", "Techno", "Hello", "Credits" };
		ArrayList<String> al = new ArrayList<>(Arrays.asList(input));
		assignment80.freqOfEachName(al); // Call the method to calculate frequency and print
	}
}
