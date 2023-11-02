package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example8 {
	
	public static void main(String[] args) {
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
		
		System.out.println(listOfNames);
		System.out.println("=============");
		String deleteObject = listOfNames.remove(1);
		System.out.println(deleteObject);
		System.out.println(listOfNames);
	}
}
