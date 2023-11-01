/*Assignment-72 : 1st Nov'2023

Write a method to return list of names having frequency more than 1 from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} */
package denish;

import java.util.ArrayList;

public class Assignment72 {

	ArrayList<String> getFreNameList(ArrayList<String> listOfNames) {
		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println("input is " + listOfNames);
		for (int index = 0; index < listOfNames.size(); index++) {
			String str = listOfNames.get(index);
			if (listOfNames.indexOf(str) != listOfNames.lastIndexOf(str)) {
				targetNameList.add(str);
			}
		}
		return targetNameList;
	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Denish");
		listOfNames.add("Hello");
		listOfNames.add("Santoki");
		listOfNames.add("Hello");
		listOfNames.add("Gaurang");
		listOfNames.add("Gaurang");
		listOfNames.add("Techno");
		listOfNames.add("Denish");
		listOfNames.add("Hello");

		Assignment72 ass = new Assignment72();
		System.out.println("output is " + ass.getFreNameList(listOfNames));
	}
}
