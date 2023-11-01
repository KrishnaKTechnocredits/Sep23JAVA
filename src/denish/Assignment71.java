/*Assignment-71 : 1st Nov'2023

Write a method to return unique list of names from given ArrayList*/
package denish;

import java.util.ArrayList;

public class Assignment71 {
	
	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println(listOfNames);
		for(int index=0; index<listOfNames.size();index++) {
			String str = listOfNames.get(index);
			if(listOfNames.indexOf(str)==listOfNames.lastIndexOf(str)) {
				targetNameList.add(str);
			}
		}
		return targetNameList;
	} 
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Denish");
		listOfNames.add("Santoki");
		listOfNames.add("Gaurang");
		listOfNames.add("Techno");
		listOfNames.add("Denish");
		listOfNames.add("Hello");
		
		Assignment71 ass = new Assignment71();
		System.out.println(ass.getUniqueNameList(listOfNames));
	}
}
