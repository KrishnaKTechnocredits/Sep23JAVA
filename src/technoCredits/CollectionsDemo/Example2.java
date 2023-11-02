package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example2 {
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Nivedita");
		listOfNames.add("Swati");
		
		for(int index=0;index<listOfNames.size();index++) {
			System.out.println(listOfNames.get(index));			
		}
		
		System.out.println(listOfNames);
	}
}
