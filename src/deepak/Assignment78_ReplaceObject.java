/*Assignment-78 : 2nd Nov'2023

Replace all occurances of given "Gaurang" with "Rahul" in a given ArrayList.

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

package deepak;

import java.util.ArrayList;

public class Assignment78_ReplaceObject {
	ArrayList<String> getReplaceList(ArrayList<String> input, String str1, String str2) {
		System.out.println("Input : " + input);
		while (input.contains(str1)) {
			int index = input.indexOf(str1);
			input.set(index, str2);
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment78_ReplaceObject output = new Assignment78_ReplaceObject();
		ArrayList<String> listOfNames = new ArrayList<>();
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
		System.out.println("Output : " + output.getReplaceList(listOfNames, "Gaurang", "Rahul"));
	}
}
