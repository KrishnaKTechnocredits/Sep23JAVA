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
output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]

while(listOfName.contains("Gaurang")){
	listOfNames.remove("Gaurang");
}
*/

package roshani;

import java.util.ArrayList;

public class Assignment78 {
	
	void removeName(ArrayList<String> output) {
		while(output.contains("Gaurang")){
			output.remove("Gaurang");
		}
		System.out.println("\nOutput ArrayList is: " + output);
	}
	
	public static void main(String[] args) {
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
		
		System.out.println("Input Arraylist is: " + listOfNames);
		new Assignment78().removeName(listOfNames);	
	}
}
