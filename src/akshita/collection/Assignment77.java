//Remove all occurances of given name from ArrayList.
package akshita.collection;

import java.util.ArrayList;

public class Assignment77 {

	void removeG(ArrayList<String> input) {
		for(int index=0;index<input.size();index++) {
			if(input.contains("Gaurang")) {
				input.remove("Gaurang");
			}
		}
		System.out.println("Output : " + input);
	}
	
	public static void main(String[] args) {
		Assignment77 ass77 = new Assignment77();
		System.out.println("Remove all occurances of given name from ArrayList");
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Sakshi");
		listOfNames.add("Swati");
		listOfNames.add("Gaurang");
		listOfNames.add("Onkar");
		listOfNames.add("Jay"); 
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");
		System.out.println("Input : " + listOfNames);
		ass77.removeG(listOfNames);
	}
}
