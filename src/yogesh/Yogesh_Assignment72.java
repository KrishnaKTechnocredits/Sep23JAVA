//Assignment-72 : 1st Nov'2023
//
//Write a method to return list of names having frequency more than 1 from given ArrayList.
//
//ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
//	ArrayList<String> targetNameList = new ArrayList<String>();
//	// Here add your logic
//	return targetNameList;
//} 
//
//Hint : use indexOf() and lastIndexOf()
//
//---------------------------
//
//if(listOfNames.indexOf("Sakshi")>=0){ // Valid index, name is available
//	
//}
package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment72 {

	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println("Input:--" + listOfNames);
		for (int i = 0; i < listOfNames.size(); i++) {
			String str = listOfNames.get(i);
			if (listOfNames.indexOf(str) != listOfNames.lastIndexOf(str)) {
				if (!targetNameList.contains(str))
					targetNameList.add(str);
			}
		}

		return targetNameList;
	}

	public static void main(String[] args) {
		Yogesh_Assignment72 assignment72 = new Yogesh_Assignment72();
		ArrayList<String> names = new ArrayList<>();
		names.add("Akshay");
		names.add("yogesh");
		names.add("jacky");
		names.add("yogesh");
		names.add("maulik");
		names.add("simran");
		names.add("yogesh");
		System.out.println(assignment72.getUniqueNameList(names));

	}
}
