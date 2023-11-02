/*Assignment-80 : 3rd Nov'2023

Write a program to print freq of each name using ArrayList.

input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1
*/

package roshani;

import java.util.ArrayList;
import java.util.Arrays;

public class Ass80PrintFreqOfNameArrayList {
	void printFreq(ArrayList<String> input) {
		while(input.size() > 0) {
			String name = input.get(0);
			int orgSize = input.size();
			
			while(input.contains(name)) {
				input.remove(name);
			}
			int newSize = input.size();
			System.out.println("Freq of  '" + name + "' is --> " + (orgSize - newSize ));
		}
	}
	
	public static void main(String[] args) {
		Ass80PrintFreqOfNameArrayList assignment80 = new Ass80PrintFreqOfNameArrayList();
		String[] names = {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"};
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(names));
		System.out.println("Input : " + listOfNames);
		assignment80.printFreq(listOfNames);
	}
}
