package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example6 {
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Onkar");
		listOfNames.add("Jay"); // Techno // Jay
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Jyoti");
	
		System.out.println(listOfNames);
		System.out.println("================");
		String temp =  listOfNames.set(3, "Techno"); // Jay
		temp = listOfNames.set(3, temp); // Techno
		System.out.println(temp); //Techno
		System.out.println(listOfNames.get(3)); // Jay
		
		System.out.println(listOfNames.size());
		listOfNames.add(4, "Sayali");
		System.out.println(listOfNames);
		
	}
}
