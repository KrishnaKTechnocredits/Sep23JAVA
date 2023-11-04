/* Write a program to print freq of each name using ArrayList.
input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1 */

package sayali;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {

	void printFrequencyOfName(ArrayList<String> al) {
		while (al.size() > 0) {
			String temp = al.get(0);
			int currentLength = al.size();
			while (al.contains(temp)) {
				al.remove(temp);
			}
			int newLength = al.size();
			System.out.println(temp + " -> " + (currentLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment80 ass80 = new Assignment80();
		System.out.println("Output: ");
		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList("Techno", "Credits", "Techno", "Techno", "Hello", "Credits"));
		ass80.printFrequencyOfName(al);
	}
}