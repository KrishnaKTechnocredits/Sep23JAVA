/* Write a program to print freq of each name using ArrayList.

input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1   */

package akshita.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {

	void frequency(ArrayList<String> input) {
		while (input.size() > 0) {
			int oLength = input.size();
			String str = input.get(0);
			while (input.contains(str)) {
				input.remove(str);
			}
			int nLength = input.size();
			System.out.println(str + "=>" + (oLength - nLength));
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Techno", "Credits", "Techno", "Techno", "Hello", "Credits" };
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		Assignment80 ass80 = new Assignment80();
		System.out.println("Print freq of each name using ArrayList");
		System.out.println("Input : " + al);
		ass80.frequency(al);
	}
}
