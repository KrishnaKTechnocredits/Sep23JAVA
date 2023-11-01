/* Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
}   */

package sayali;

import java.util.ArrayList;

public class Assignment70 {

	void getUniqueNameList(ArrayList<String> listOfNames) {

		System.out.println(listOfNames);
		System.out.println("\nUnique names from given list are as follows: ");
		for (int index = 0; index < listOfNames.size(); index++) {
			String str = listOfNames.get(index);
			if (listOfNames.indexOf(str) == listOfNames.lastIndexOf(str)) 
			{
				System.out.println(" " +str);
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Credits");
		listOfNames.add("Sayali");
		listOfNames.add("Swati");
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Dipti");
		listOfNames.add("Kriti");
		new Assignment70().getUniqueNameList(listOfNames);
	}
}