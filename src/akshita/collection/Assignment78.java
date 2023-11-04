//Remove all occurrences of given "Gaurang" with "Rahul" in a given ArrayList.

package akshita.collection;

import java.util.ArrayList;

public class Assignment78 {
	
	void replace(ArrayList<String> input) {
		for(int index=0;index<input.size();index++) {
			if(input.contains("Gaurang")) {
				input.set(input.indexOf("Gaurang"), "Rahul");
			}
		}
		System.out.println("Output : "+ input);
	}

	public static void main(String[] args) {
		Assignment78 ass78 = new Assignment78();
	    System.out.println("Remove all occurrences of given 'Gaurang' with 'Rahul' in a given ArrayList");
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
		System.out.println(listOfNames);
		ass78.replace(listOfNames);
	}
}
