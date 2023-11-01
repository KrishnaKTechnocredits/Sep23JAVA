/* Write a method to return list of names having frequency more than 1 from given ArrayList.
ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} */

package sayali;

import java.util.ArrayList;

public class Assignment72 {

	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println("Input: " + listOfNames);
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
		listOfNames.add("Sayali");
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Techno");
		listOfNames.add("Swati");
		listOfNames.add("Swati");
		listOfNames.add("Techno");
		listOfNames.add("Sayali");
		listOfNames.add("Dipti");

		Assignment72 ass72 = new Assignment72();
		System.out.println("output: " + ass72.getUniqueNameList(listOfNames));
	}
}