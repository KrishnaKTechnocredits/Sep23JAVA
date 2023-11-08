//Remove all occurances of given name from ArrayList.

package aditya.Collection;

import java.util.ArrayList;

public class Assignment77 {

	void RemoveOccurence(ArrayList<String> listOfNames) {

		while (listOfNames.contains("Gaurang")) {
			listOfNames.remove("Gaurang");
		}
		System.out.println(listOfNames);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listOfNames = new ArrayList<String>();

		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Gaurang");
		listOfNames.add("Onkar");
		listOfNames.add("Jay");
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");

		System.out.println(listOfNames);
		new Assignment77().RemoveOccurence(listOfNames);

	}

}
