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
}*/

package deepak;

import java.util.ArrayList;

public class Assignment77_RemoveFunction {
	ArrayList<String> removeElement(ArrayList<String> input, String str) {
		System.out.println("Input : " + input);
		while (input.contains(str)) {
			input.remove(str);
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment77_RemoveFunction output = new Assignment77_RemoveFunction();
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
		System.out.println("Output : " + output.removeElement(listOfNames, "Gaurang"));
	}
}
