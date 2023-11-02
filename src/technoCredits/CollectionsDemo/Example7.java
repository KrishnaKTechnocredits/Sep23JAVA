package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example7 {
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Onkar");
		listOfNames.add("Jay"); // Techno // Jay
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Jyoti");
		
		System.out.println(listOfNames);
		System.out.println("=============");
		boolean flag = listOfNames.remove("Gaurang");
		System.out.println(flag);
		System.out.println(listOfNames);
	}
}
