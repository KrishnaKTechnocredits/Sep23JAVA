/*
Assignment-72 : 1st Nov'2023

Write a method to return list of names having frequency more than 1 from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} 
Hint : use indexOf() and lastIndexOf()
if(listOfNames.indexOf("Sakshi")>=0){ // Valid index, name is available
	
}
*/

package deepak;

import java.util.ArrayList;

public class Assignment72_DuplicateNamesArrayList {

	ArrayList<String> getDuplicateNames(ArrayList<String> input) {
		System.out.println("Input : " + input);
		ArrayList<String> output = new ArrayList<>();
		for (int index = 0; index < input.size(); index++) {
			String str = input.get(index);
			if (input.indexOf(str) != input.lastIndexOf(str))
				if (!output.contains(str)) {
					output.add(str);
				}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment72_DuplicateNamesArrayList output = new Assignment72_DuplicateNamesArrayList();
		ArrayList<String> inputArrayList = new ArrayList<>();
		inputArrayList.add("Divit");
		inputArrayList.add("Sonal");
		inputArrayList.add("Harsh");
		inputArrayList.add("Rohit");
		inputArrayList.add("Deepak");
		inputArrayList.add("Rohit");
		inputArrayList.add("Harsh");
		System.out.println("Output : " + output.getDuplicateNames(inputArrayList));
	}
}
