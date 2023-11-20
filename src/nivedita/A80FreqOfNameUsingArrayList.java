/*Assignment-80 : 3rd Nov'2023
Write a program to print freq of each name using ArrayList.
input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1
*/
package nivedita;

import java.util.ArrayList;
import java.util.Arrays;

public class A80FreqOfNameUsingArrayList {

	void printFreqOfEachString(ArrayList<String> input) {
		System.out.println("Input : " + input);
		System.out.println("Output : ");
		while (input.size() > 0) {
			int orgSize = input.size();
			String str = input.get(0);
			while (input.contains(str)) {
				input.remove(str);
			}
			int remSize = input.size();
			System.out.println(str + " --> " + (orgSize - remSize));
		}
	}

	public static void main(String[] args) {
		A80FreqOfNameUsingArrayList output = new A80FreqOfNameUsingArrayList();
		ArrayList<String> input = new ArrayList<String>(
				Arrays.asList("Techno", "Credits", "Techno", "Techno", "Hello", "Credits"));
		output.printFreqOfEachString(input);
	}
}
