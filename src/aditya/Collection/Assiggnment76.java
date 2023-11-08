//Remove all the duplicate values from the list. 

package aditya.Collection;

import java.util.ArrayList;

public class Assiggnment76 {

	void duplicateElement(ArrayList<String> Dlist) {
		for (int index = 0; index < Dlist.size(); index++) {
			String input = Dlist.get(index);
			if (Dlist.indexOf(input) != Dlist.lastIndexOf(input)) {
				// Dlist.remove(input);
				// Dlist.remove(input.lastIndexOf(input));
				Dlist.remove(Dlist.lastIndexOf(input));

			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Dlist = new ArrayList<String>();
		Dlist.add("Techno");
		Dlist.add("Credits");
		Dlist.add("Techno");
		Dlist.add("Hi");
		Dlist.add("Hello");
		Dlist.add("Pune");
		Dlist.add("Hi");
		System.out.println(Dlist);
		new Assiggnment76().duplicateElement(Dlist);
		System.out.println(Dlist);

	}

}
