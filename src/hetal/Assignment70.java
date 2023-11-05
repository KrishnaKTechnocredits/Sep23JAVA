/*write a program to print unique names from given arraylist*/


package hetal;

import java.util.ArrayList;

public class Assignment70 {
	
	void getUniqueName(ArrayList<String> listOfNames) {
		
		System.out.println("Unique names in the given arraylist : ");
		
		for (int index = 0; index < listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if (listOfNames.indexOf(name) == listOfNames.lastIndexOf(name)) 
			{
				//System.out.println("Unique names from given Arraylist : ");
				System.out.println(name);
			}
		}
	}
		
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Hetal");
		listOfNames.add("Sakshi");
		listOfNames.add("Jay");
		listOfNames.add("sayali");
		listOfNames.add("shrutika");
		listOfNames.add("Hetal");
		listOfNames.add("Gaurang");
		listOfNames.add("Sakshi");
		
		new Assignment70().getUniqueName(listOfNames);
	}
}
