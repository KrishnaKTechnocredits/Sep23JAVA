/*Assignment-70 : 1st Nov'2023

Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
} */

package denish;

import java.util.ArrayList;

public class Assignment70 {

	void getUniqueNameList(ArrayList<String> listOfNames) {
		System.out.println(listOfNames);
		for (int index = 0; index < listOfNames.size(); index++) {
			String str = listOfNames.get(index);
			if (listOfNames.indexOf(str) == listOfNames.lastIndexOf(str)) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Denish");
		listOfNames.add("Santoki");
		listOfNames.add("Gaurang");
		listOfNames.add("Techno");
		listOfNames.add("Denish");
		listOfNames.add("Hello");

		new Assignment70().getUniqueNameList(listOfNames);
	}
}
