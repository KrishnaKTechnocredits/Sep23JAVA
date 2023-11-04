/*
 Assignment-78 : 2nd Nov'2023

Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.

ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Gaurang");
		listOfNames.add("Onkar");
		listOfNames.add("Jay"); // Techno // Jay
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");

input : Gaurang
output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]

while(listOfName.contains("Gaurang")){
	listOfNames.remove("Gaurang");
}
 */
package jyoti_CollectionFrameWork;

import java.util.ArrayList;

public class Assignment78 {

	ArrayList<String> replaceString(ArrayList<String> inputArray, String removeStr, String addStr) {
		for (int index = 0; index < inputArray.size(); index++) {
			String str = inputArray.get(index);
			if (str.equals(removeStr)) {
				inputArray.remove(index);
				inputArray.add(index, addStr);
			}
		}
		return inputArray;
	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Gaurang");
		listOfNames.add("Onkar");
		listOfNames.add("Jay");
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");
		System.out.println("Original list-->" + listOfNames);
		System.out.println("================================");
		System.out.println("Output ArrayList : " + new Assignment78().replaceString(listOfNames, "Gaurang", "Rahul"));
	}
}
