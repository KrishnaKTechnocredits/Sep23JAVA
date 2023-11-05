/*
 Assignment-80 : 3rd Nov'2023

Write a program to print freq of each name using ArrayList.

input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1

 */
package jyoti_CollectionFrameWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {

	void printStringFrequency(ArrayList<String> al) {
		while (al.size() > 0) {
			String name = al.get(0);
			int currentLength = al.size();
			while (al.contains(name)) {
				al.remove(name);
			}
			int newLength = al.size();
			System.out.println(name + " -> " + (currentLength - newLength));
		}
	}

	public static void main(String[] args) {
		Assignment80 ass80 = new Assignment80();
		ArrayList<String> input = new ArrayList<String>(
				Arrays.asList("Techno", "Credits", "Techno", "Techno", "Hello", "Credits"));
		System.out.println("Original list-->" + input);
		System.out.println("===============================");
		System.out.println("Output: ");
		ass80.printStringFrequency(input);
	}
}
