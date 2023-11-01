/*
Assignment-70 : 1st Nov'2023
Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
} 
*/

package deepak;

import java.util.ArrayList;

public class Assignment70_UniqueNamesArrayList {
	void printUniqueNames(ArrayList<String> listOfNames) {
		System.out.println("Input: ");
		System.out.println(listOfNames);
		System.out.println("Output: Unique Names Printing");
		for (int index = 0; index < listOfNames.size(); index++) {
			String str = listOfNames.get(index);
			if (listOfNames.indexOf(str) == listOfNames.lastIndexOf(str)) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		Assignment70_UniqueNamesArrayList output = new Assignment70_UniqueNamesArrayList();
		ArrayList<String> inputArrayList = new ArrayList<>();
		inputArrayList.add("Deepak");
		inputArrayList.add("Divit");
		inputArrayList.add("Deepak");
		inputArrayList.add("Nikhil");
		inputArrayList.add("Rahul");
		inputArrayList.add("Nikhil");
		inputArrayList.add("Rahul");
		inputArrayList.add("Sonal");
		output.printUniqueNames(inputArrayList);
	}
}
