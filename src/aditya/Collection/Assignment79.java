//Write a program to print freq of each number using ArrayList.

package aditya.Collection;

import java.util.*;

public class Assignment79 {

	void frequnecyOfNumbers(ArrayList<Integer> List) {
		while (List.size() > 0) {
			int num = List.get(0);
			int OrgList = List.size();
			while (List.contains(num)) {
				List.remove(Integer.valueOf(num));

			}
			int newLength = List.size();
			System.out.println(num + "---" + (OrgList - newLength));
		}

	}

	public static void main(String[] args) {
		Integer[] ArrList = { 10, 20, 10, 10, 11, 11, 13 };
		ArrayList<Integer> List = new ArrayList<Integer>(Arrays.asList(ArrList));
		new Assignment79().frequnecyOfNumbers(List);
	}

}
