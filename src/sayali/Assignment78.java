/* Remove all occurances of given "Gaurang" & repalce with "Rahul" in a given ArrayList.

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
} */

package sayali;

import java.util.ArrayList;

public class Assignment78 {

	void getListAfterNameReplace(ArrayList<String> listOfNames, String fromReplace, String toreplace) {

		System.out.println("\n Input: "+ listOfNames);
		while (listOfNames.contains(fromReplace)) {
			int index = 0;
			index = listOfNames.indexOf(fromReplace);
			listOfNames.set(index, toreplace);
		}
		System.out.println("\n Output: "+listOfNames);
	}

	public static void main(String[] args) {

		Assignment78 ass78 = new Assignment78();
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
		ass78.getListAfterNameReplace(listOfNames, "Gaurang", "Rahul");
	}
}