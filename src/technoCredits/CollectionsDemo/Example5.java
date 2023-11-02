package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example5 {
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Onkar");
		listOfNames.add("Jay");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Jyoti");
		
		System.out.println(listOfNames);
		listOfNames.add(1, "Techno");
		System.out.println(listOfNames);
		
		
	}
}
