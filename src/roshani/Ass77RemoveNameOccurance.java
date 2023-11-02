/*Assignment-77 : 2nd Nov'2023

Remove all occurances of given name from ArrayList.

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
output : [Sakshi, Swati, Onkar, Jay, Hetal, Nivedita, Onkar, Jyoti]

while(listOfName.contains("Gaurang")){
	listOfNames.remove("Gaurang");
}
*/
package roshani;

import java.util.ArrayList;

public class Ass77RemoveNameOccurance {
	
	void removeName(ArrayList<String> output) {
		while(output.contains("Gaurang")) {
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
		listOfNames.add("Jay"); // Techno // Jay
		listOfNames.add("Gaurang");
		listOfNames.add("Hetal");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Gaurang");
		listOfNames.add("Jyoti");
		
		System.out.println("Input ArrayList is: " + listOfNames);
		new Ass77RemoveNameOccurance().removeName(listOfNames);
	}
}
