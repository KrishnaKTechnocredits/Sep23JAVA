/*Write a program to print freq of each name using ArrayList.

input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1*/

package onkar;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {
	
	void printFreq(ArrayList<String> list) {
		while(list.size()!=0) {
			String name = list.get(0);
			int startLen = list.size();
			while (list.contains(name))
				list.remove(name);
			int endLen = list.size();
			System.out.println(name+" -> "+(startLen - endLen));
		}
	}
	
	public static void main(String[] args) {
		String[] arr = {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"};
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(arr));
		new Assignment80().printFreq(listOfNames);
	}
}
