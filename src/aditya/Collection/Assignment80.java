//Write a program to print freq of each number using ArrayList.

package aditya.Collection;

import java.util.*;

public class Assignment80{

	void frequnecyOfNumbers(ArrayList<String> List) {
		while (List.size() > 0) {
			String num = List.get(0);
			int OrgList = List.size();
			while (List.contains(num)) {
				List.remove(String.valueOf(num));

			}
			int newLength = List.size();
			System.out.println(num + "---" + (OrgList - newLength));
		}

	}

	public static void main(String[] args) {
		String[] ArrList = { "Techno", "Credits", "Techno", "Techno", "Hello","Credits"};
		ArrayList<String> List = new ArrayList<String>(Arrays.asList(ArrList));
		new Assignment80().frequnecyOfNumbers(List);
	}

}
