//Assignment-76 : 2nd Nov'2023
//
//Remove all the duplicate values from the list. 
//
//input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
//output : {"Techno", "Credits", "Hi", "Hello","Pune"}  
//
//hint : get(), indexOf(), lastIndexOf(), remove()

package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment76 {

	void getDuplicateList(ArrayList<String> listOfNames) {
		System.out.println(listOfNames);
		for (int i = 0; i < listOfNames.size(); i++) {
			String str = listOfNames.get(i);
			if (listOfNames.indexOf(str)!= listOfNames.lastIndexOf(str)) {
				listOfNames.remove(listOfNames.lastIndexOf(str));
				i--;
			}
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment76 assignment76 = new Yogesh_Assignment76();
		ArrayList<String> names = new ArrayList<>();
		names.add("Techno");
		names.add("Credits");
		names.add("Techno");
		names.add("Hi");
		names.add("Hello");
		names.add("Pune");
		names.add("Hi");

		assignment76.getDuplicateList(names);
		System.out.println(names);
}
}
