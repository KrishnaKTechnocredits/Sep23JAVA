/*Write a method to return unique list of names from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} */

package onkar;

import java.util.ArrayList;

public class Assignment71 {
	
	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String>();
		for (int index=0; index<listOfNames.size(); index++) {
			String input = listOfNames.get(index);
			if(listOfNames.indexOf(input) == listOfNames.lastIndexOf(input)) {
				targetNameList.add(input);
			}
		}
		return targetNameList;
	}
	
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Onkar");
		a1.add("jay");
		a1.add("narendra");
		a1.add("rahul");
		a1.add("Onkar");
		a1.add("swati");
		a1.add("sakshi");
		a1.add("rahul");
		a1.add("hetal");
		a1.add("jay");
		a1.add("denish");
		a1.add("rahul");
		ArrayList<String> outputArr = new Assignment71().getUniqueNameList(a1);
		System.out.println("Input array is : "+a1);
		System.out.println("Unique names from given input ArrayList : "+outputArr);
	}
}
