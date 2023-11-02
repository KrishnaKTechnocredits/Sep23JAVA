//Write a method to return unique list of names from given ArrayList.
//
//ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
//	ArrayList<String> targetNameList = new ArrayList<String>();
//	// Here add your logic
//	return targetNameList;
//} 
package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment71 {
	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println("Input:--" + listOfNames);
		for (int i = 0; i < listOfNames.size(); i++) {
			String str = listOfNames.get(i);
			if (listOfNames.indexOf(str) == listOfNames.lastIndexOf(str)) {
				targetNameList.add(str);
			}
		}

		return targetNameList;
	}

	public static void main(String[] args) {
		Yogesh_Assignment71 assignment71 = new Yogesh_Assignment71();
		ArrayList<String> names = new ArrayList<>();
		names.add("Akshay");
		names.add("yogesh");
		names.add("jacky");
		names.add("yogesh");
		names.add("maulik");
		names.add("simran");
		names.add("yogesh");
		System.out.println(assignment71.getUniqueNameList(names));

	}
}
