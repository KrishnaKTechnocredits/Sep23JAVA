/*Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
}*/

package akshita.collection;

import java.util.ArrayList;

public class Assignment70 {
	void getUniqueName(ArrayList<String> listOfName) {
		for (int index = 0; index < listOfName.size(); index++) {
			String name= listOfName.get(index);
			if (listOfName.indexOf(name) == listOfName.lastIndexOf(name)) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Techno");
		a1.add("credits");
		a1.add("batch");
		a1.add("Techno");
		a1.add("credits");
		a1.add("2023");
		a1.add("Selenium");
		System.out.println(a1);
		System.out.println("print unique names from given ArrayList");
		new Assignment70().getUniqueName(a1);
	}
}
