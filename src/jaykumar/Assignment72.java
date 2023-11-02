/*Assignment-72 : 1st Nov'2023
Write a method to return list of names having frequency more than 1 from given ArrayList.*/

package jaykumar;

import java.util.ArrayList;

public class Assignment72 {
	
	static ArrayList<String> getRepeatNames(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println("Given listof names is: "+listOfNames);
		for(int index=0; index<listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if(listOfNames.indexOf(name)!=listOfNames.lastIndexOf(name)) {
				if(!targetNameList.contains(name)) {
					targetNameList.add(name);
				}
				}
		}
		return targetNameList;
	}

	public static void main(String[] args) {
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
		System.out.println(Assignment72.getRepeatNames(listOfNames));
	}
}
