/*Assignment - 77 Remove all occurances of given name from ArrayList.
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
package shrutika;

import java.util.ArrayList;

public class As77RemoveAllOccurance {

	ArrayList<String> removeInputString(ArrayList<String> inputarray, String input) {
		for (int index = 0; index < inputarray.size(); index++) {
			String str = inputarray.get(index);
			if (str.equals(input)) {
				inputarray.remove(index);
			}
		}
		return inputarray;
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
		System.out.println(
				"Output ArrayList -> " + new As77RemoveAllOccurance().removeInputString(listOfNames, "Gaurang"));
	}
}
