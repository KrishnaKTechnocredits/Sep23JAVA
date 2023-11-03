/*Assignment-78 : 2nd Nov'2023

Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.

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

input : Gaurang
output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]*/
package denish;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment78 {
	
	void replaceAll(ArrayList<String> listOfNames, String input, String replace) {
		System.out.println("Input is : "+listOfNames);
		while(listOfNames.contains(input)) {
			int temp = listOfNames.indexOf(input);
			listOfNames.set(temp, replace);
		}
		System.out.println("Output is : " +listOfNames);
	}

	public static void main(String[] args) {
		Assignment78 ass = new Assignment78();
		String[] arr = {"Sakshi","Swati","Gaurang","Onkar","Jay","Gaurang","Hetal","Nivedita","Onkar","Gaurang","Jyoti"};
		ArrayList<String> listOfNames = new ArrayList<String>(Arrays.asList(arr));
		ass.replaceAll(listOfNames,"Gaurang","Rahul");
	}
}
