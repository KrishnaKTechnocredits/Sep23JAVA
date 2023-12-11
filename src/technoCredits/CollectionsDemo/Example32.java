package technoCredits.CollectionsDemo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Example32 {
	
	public static void main(String[] args) {
		Set<String> setOfNames = new LinkedHashSet<String>(
				Arrays.asList("Techno", "Credits", "Technocredits", "Hi", "Hello"));

		Iterator<String> itr = setOfNames.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			if(name.equals("Hello")){
				System.out.println(itr.next());
			}
		}
		System.out.println(setOfNames);
		/*
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 * System.out.println(itr.next()); System.out.println(itr.next());
		 * System.out.println(itr.next()); System.out.println("==================");
		 * System.out.println(itr.next());
		 */
		
	}
}
