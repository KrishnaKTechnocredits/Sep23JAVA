/*Assignment-76 : 2nd Nov'2023
Remove all the duplicate values from the list. 
input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"}  */

package jaykumar;

import java.util.ArrayList;

public class Assignment76 {
	
	ArrayList<String> updateList(ArrayList<String> listOfNames) {
		for(int index=0; index<listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if(listOfNames.indexOf(name)!=listOfNames.lastIndexOf(name)) {
				listOfNames.remove(listOfNames.lastIndexOf(name));
			}
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		Assignment76 a = new Assignment76();
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Techno");
		listOfNames.add("Hi");
		listOfNames.add("Hello");
		listOfNames.add("Pune");
		listOfNames.add("Hi");
		System.out.println("Given list of names is: "+listOfNames);
		System.out.println("Updated list of names is: "+a.updateList(listOfNames));
	}
}
