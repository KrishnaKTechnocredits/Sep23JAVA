package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example4 {
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Nivedita");
		listOfNames.add("Swati");
		listOfNames.add("Onkar");
		listOfNames.add("Nivedita");
		listOfNames.add("Jay");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Jyoti");
		listOfNames.add("Nivedita");
		listOfNames.add("Hetal");
	
		System.out.println(listOfNames.indexOf("Onkar"));
		System.out.println(listOfNames.lastIndexOf("Onkar"));
	}
}
