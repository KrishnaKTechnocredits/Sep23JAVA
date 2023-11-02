/*Write a method to return unique list of names from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} */

package akshita.collection;

import java.util.ArrayList;

public class Assignment71 {

	ArrayList<String> uniqueValue(ArrayList<String> listName) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < listName.size(); index++) {
			String name = listName.get(index);
			if (listName.indexOf(name) == listName.lastIndexOf(name)) {
				output.add(name);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println("return unique list of names from given ArrayList");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Techno");
		ar.add("credits");
		ar.add("batch");
		ar.add("Techno");
		ar.add("credits");
		ar.add("2023");
		ar.add("Selenium");
		System.out.println("Input : " +ar);
		
		System.out.println("Output : " +new Assignment71().uniqueValue(ar));
	}
}
