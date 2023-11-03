/*Write a program to print freq of each name using ArrayList.

input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1*/
package denish;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {

	void processData(ArrayList<String> al) {
		while (al.size() > 0) {
			String name = al.get(0);
			int orgLength = al.size();
			while (al.contains(name)) {
				al.remove(name);
			}
			int newLength = al.size();
			System.out.println(name + "->" + (orgLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment80 ass = new Assignment80();
		ArrayList<String> al = new ArrayList<String>(
				Arrays.asList("Techno", "Credits", "Techno", "Techno", "Hello", "Credits"));
		ass.processData(al);
	}
}
