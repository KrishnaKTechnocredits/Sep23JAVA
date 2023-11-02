/*Assignment-70 : 1st Nov'2023
Write a method to print unique names from given ArrayList.*/

package jaykumar;

import java.util.ArrayList;

public class Assignment70 {
	
	void getUniqueNameList(ArrayList<String> listOfNames){
		System.out.println("Given list of names is: "+listOfNames);
		System.out.println("Unique names from given list are:");
		for(int index=0; index<listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if(listOfNames.indexOf(name)==listOfNames.lastIndexOf(name)) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		Assignment70 a = new Assignment70();
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Jay");
		listOfNames.add("Onkar");
		listOfNames.add("Rahul");
		listOfNames.add("Techno");
		listOfNames.add("Rahul");
		listOfNames.add("Credits");
		listOfNames.add("Gaurang");
		listOfNames.add("Denish");
		
		a.getUniqueNameList(listOfNames);
	}
}
