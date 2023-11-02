//Assignment-70 : 1st Nov'2023
//
//Write a method to print unique names from given ArrayList.
//
//void getUniqueNameList(ArrayList<String> listOfNames){
//	// Here add your logic
//	
//} 

package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment70 {

	void getUniqueNameList(ArrayList<String> listOfNames) {
		System.out.println(listOfNames);
		for (int i = 0; i < listOfNames.size(); i++) {
			String str = listOfNames.get(i);
			if (listOfNames.indexOf(str) == listOfNames.lastIndexOf(str)) {
				System.out.println(str);
			}
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment70 assignment70 = new Yogesh_Assignment70();
		ArrayList<String> names = new ArrayList<>();
		names.add("Akshay");
		names.add("yogesh");
		names.add("jacky");
		names.add("yogesh");
		names.add("maulik");
		names.add("simran");
		names.add("yogesh");

		assignment70.getUniqueNameList(names);
	}

}
