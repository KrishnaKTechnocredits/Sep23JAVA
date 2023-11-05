/*
 Assignment-70 : 1st Nov'2023

Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
} 

 */
package jyoti_CollectionFrameWork;

import java.util.ArrayList;

public class Assignment70 {

	void getUniqueNameList(ArrayList<String> listOfNames) {
		System.out.println("Unique Name list ");
		System.out.println("===========================");
		for (int index = 0; index < listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if (listOfNames.indexOf(name) == listOfNames.lastIndexOf(name)) {

				System.out.println(name);
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Jyoti");
		listOfNames.add("Saxena");
		listOfNames.add("Bharti");
		listOfNames.add("Saxena");
		listOfNames.add("Aadi");
		listOfNames.add("Saxena");
		listOfNames.add("Aarav");
		listOfNames.add("Saxena");
		listOfNames.add("Taani");

		System.out.println("Original list of Names");
		System.out.println(listOfNames);

		new Assignment70().getUniqueNameList(listOfNames);

	}

}
