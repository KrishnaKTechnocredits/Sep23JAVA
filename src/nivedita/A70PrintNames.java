/*Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
} */

package nivedita;

import java.util.ArrayList;

public class A70PrintNames {
	
	void getUniqueNameList(ArrayList<String> listOfNames){
		System.out.println("Below are the unique elements of the given ArrayList :");
		for (int index=0; index<listOfNames.size(); index++) {
			String input = listOfNames.get(index);
			if(listOfNames.indexOf(input) == listOfNames.lastIndexOf(input))
				System.out.println(input);
		}
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
		new A70PrintNames().getUniqueNameList(a1);
	}
}
