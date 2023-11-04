/*Assignment-80 : 3rd Nov'2023
Write a program to print freq of each name using ArrayList.
input : {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"}
output : Techno -> 3
         Credits -> 2
		 Hello -> 1
*/
package jaykumar;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment80 {
	
	void freqName(ArrayList<String> listOfName) {
		System.out.println("Given list of names: "+listOfName);
		while(listOfName.size()!=0) {
			int oldLen = listOfName.size();
			String str = listOfName.get(0);
			while(listOfName.contains(str)) {
				listOfName.remove(str);
			}
			int newLen = listOfName.size();
			System.out.println(str+" -> "+(oldLen-newLen));
		}
	}

	public static void main(String[] args) {
		String[] arr = {"Techno", "Credits", "Techno", "Techno", "Hello","Credits"};
		ArrayList<String> listOfName = new ArrayList<String> (Arrays.asList(arr));
		new Assignment80().freqName(listOfName);
	}
}
