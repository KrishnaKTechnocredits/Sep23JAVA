/*
Assignment-71 : 1st Nov'2023

Write a method to return unique list of names from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} 
*/
package deepak;

import java.util.ArrayList;

public class Assignment71_GetUniqueNameArrayList {

	ArrayList<String> getUniqueNames(ArrayList<String> input) {
		ArrayList<String> output = new ArrayList<>();
		System.out.println("Input : " + input);
		System.out.println("Output : Unique Names in ArrayList ");
		for (int index = 0; index < input.size(); index++) {
			String str = input.get(index);
			if (input.indexOf(str) == input.lastIndexOf(str)) {
				output.add(str);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment71_GetUniqueNameArrayList output = new Assignment71_GetUniqueNameArrayList();
		ArrayList<String> inputArrayList = new ArrayList<>();
		inputArrayList.add("Divit");
		inputArrayList.add("Sonal");
		inputArrayList.add("Harsh");
		inputArrayList.add("Rohit");
		inputArrayList.add("Deepak");
		inputArrayList.add("Rohit");
		inputArrayList.add("Harsh");
		System.out.println(output.getUniqueNames(inputArrayList));
	}
}
