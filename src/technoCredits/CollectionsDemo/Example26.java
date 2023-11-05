package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example26 {

	public static void main(String[] args) {
		Set<String> setOfNames = new LinkedHashSet<String>();
		setOfNames.add("Shrutika");
		setOfNames.add("Denish");
		setOfNames.add("Rahul");
		setOfNames.add("Jay");
		setOfNames.add("Jyoti");
		setOfNames.add("Denish");
		setOfNames.add("Gaurang");
		
		System.out.println(setOfNames);
		String firstName = "";
		String lastName = "";
		
		for(String name : setOfNames) {
			if(firstName.equals(""))
				firstName = name;
			lastName = name;
		}
		System.out.println(firstName);
		System.out.println(lastName);
	}
}
