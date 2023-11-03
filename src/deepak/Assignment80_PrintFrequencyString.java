/*Assignment-80 : 3rd Nov'2023

Write a program to print freq of each name using ArrayList.

input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1

*/

package deepak;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80_PrintFrequencyString {

	void printStringFreq(ArrayList<String> input) {
		System.out.println("Input : "+input);
		System.out.println("Output : ");
		while (input.size() > 0) {
			int oSize = input.size();
			String str = input.get(0);
			while (input.contains(str)) {
				input.remove(str);
			}
			int nSize = input.size();
			System.out.println(str + " -> " + (oSize - nSize));
		}
	}

	public static void main(String[] args) {
		Assignment80_PrintFrequencyString output = new Assignment80_PrintFrequencyString();
		ArrayList<String> input = new ArrayList<String>(
				Arrays.asList("Techno", "Credits", "Techno", "Techno", "Hello", "Credits"));
		output.printStringFreq(input);
	}
}
