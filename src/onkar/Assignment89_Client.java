package onkar;

import java.util.HashSet;
import java.util.Set;

public class Assignment89_Client {
	
	public static void main (String[] args) {
		Assignment89 a1 = new Assignment89("Onkar", 00057362, "QA", 50000, 4);
		Assignment89 a2 = new Assignment89("Deepak", 00057363, "QA", 57000, 4);
		Assignment89 a3 = new Assignment89("Yogesh", 00057367, "QA", 89000, 4);
		Assignment89 a4 = new Assignment89("Jay", 00057364, "QA", 50000, 4);
		Assignment89 a5 = new Assignment89("Onkar", 00057362, "QA", 50000, 4);
		
		Set<Assignment89> setOfEmployees = new HashSet<Assignment89>();
		setOfEmployees.add(a1);
		setOfEmployees.add(a2);
		setOfEmployees.add(a3);
		setOfEmployees.add(a4);
		setOfEmployees.add(a5);
		
		System.out.println("Created 5 objects of given class and made the comparison on its variable when stored in HashSet");
		System.out.println("Size of HashSet : "+setOfEmployees.size());
	}
}
