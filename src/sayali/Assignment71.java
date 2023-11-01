/* Write a method to return unique list of names from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} */

package sayali;

import java.util.ArrayList;

public class Assignment71 {

	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames) {

		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println("ArrayList: " +listOfNames);
		System.out.println("\nUnique names from given ArrayList are as follows:");
		for (int index = 0; index < listOfNames.size(); index++) {
			String str = listOfNames.get(index);
			if (listOfNames.indexOf(str) == listOfNames.lastIndexOf(str)) {
				targetNameList.add(str);
			}
		}
		return targetNameList;
	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Credits");
		listOfNames.add("Sayali");
		listOfNames.add("Swati");
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Dipti");

		Assignment71 ass71 = new Assignment71();
		System.out.println(ass71.getUniqueNameList(listOfNames));
	}
}