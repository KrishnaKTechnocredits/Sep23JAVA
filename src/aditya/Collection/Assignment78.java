//Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.

package aditya.Collection;

import java.util.ArrayList;

public class Assignment78 {

	void RemoveOccurence(ArrayList<String> listOfNames, String name) {
		while (listOfNames.contains(name)) {
			listOfNames.set(listOfNames.indexOf(name), "Rahul");
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
		listOfNames.add("Jay"); // Techno // Jay
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");

		String org = "Gaurang";
		System.out.println(listOfNames);
		new Assignment78().RemoveOccurence(listOfNames, org);

	}

}
