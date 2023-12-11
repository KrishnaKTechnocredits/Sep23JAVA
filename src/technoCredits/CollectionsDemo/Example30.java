package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example30 {

	public static void main(String[] args) {
		List<String> listOfNames = new ArrayList<String>(
				Arrays.asList("Techno", "Credits", "Technocredits", "Hi", "Hello"));

		listOfNames.add("Onkar");
		listOfNames.remove(0);
		for (String name : listOfNames) {
			if (name.length() > 10) {
				listOfNames.set(2, "Technocredits-New");
			}
			System.out.println(name);
		}
		System.out.println(listOfNames);

		for (int index = 0; index < listOfNames.size(); index++) {
			System.out.println(listOfNames.get(index));
			if (listOfNames.get(index).length() > 10)
				listOfNames.remove(index);
		}
	}
}
