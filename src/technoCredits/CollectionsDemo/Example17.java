package technoCredits.CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class Example17 {

	public static void main(String[] args) {
		ArrayList<String> listOfName = new ArrayList<String>(
				Arrays.asList("Swati","Deepak", "Nivedita", "Jay", "Sakshi","Deepak","Deepak"));
		
		/*
		 * while(listOfName.contains("Deepak")) { listOfName.remove("Deepak"); }
		 */
		
		ArrayList<String> removeList = new ArrayList<String>();
		removeList.add("Deepak");
		removeList.add("Onkar");
		
		listOfName.removeAll(removeList);
		
		System.out.println(listOfName);
	}
}
