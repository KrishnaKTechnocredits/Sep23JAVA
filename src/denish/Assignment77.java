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
*/
package denish;

import java.util.ArrayList;

public class Assignment77 {

	void removeAll(ArrayList<String> listOfNames) {
		System.out.println("Input is : " + listOfNames);
		while (listOfNames.contains("Gaurang")) {
			listOfNames.remove("Gaurang");
		}
		System.out.println("Output is : " + listOfNames);
	}

	public static void main(String[] args) {
		Assignment77 ass = new Assignment77();
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
		ass.removeAll(listOfNames);
	}
}
