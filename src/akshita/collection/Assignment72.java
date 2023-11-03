//Write a method to return list of names having frequency more than 1 from given ArrayList.

package akshita.collection;

import java.util.ArrayList;

public class Assignment72 {

	ArrayList<String> frequency(ArrayList<String> listName) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < listName.size(); index++) {
			String name = listName.get(index);
			if (listName.indexOf(name) != listName.lastIndexOf(name)) {
				if (!output.contains(name)) {
					output.add(name);
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println("Return list of names having frequency more than 1 from given ArrayList");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Techno");
		ar.add("credits");
		ar.add("batch");
		ar.add("Techno");
		ar.add("credits");
		ar.add("Techno");
		ar.add("Selenium");
		System.out.println("Input : " + ar);
		System.out.println("Output : " + new Assignment72().frequency(ar));
	}
}
