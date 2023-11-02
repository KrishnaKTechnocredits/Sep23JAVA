/*Assignment-76 : 2nd Nov'2023

Remove all the duplicate values from the list. 

input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"}  

hint : get(), indexOf(), lastIndexOf(), remove()*/
package denish;

import java.util.ArrayList;

public class Assignment76 {

	ArrayList<String> getduplicateName(ArrayList<String> listOfNames) {
		System.out.println("Input is " + listOfNames);
		for (int index = 0; index < listOfNames.size(); index++) {
			String str = listOfNames.get(index);
			if (listOfNames.indexOf(str) != listOfNames.lastIndexOf(str)) {
				listOfNames.remove(listOfNames.lastIndexOf(str));
			}
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		Assignment76 ass = new Assignment76();
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Techno");
		listOfNames.add("Hi");
		listOfNames.add("Hello");
		listOfNames.add("Pune");
		listOfNames.add("Hi");

		System.out.println(ass.getduplicateName(listOfNames));
	}

}
