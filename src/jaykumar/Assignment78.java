/*Assignment-78 : 2nd Nov'2023
Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.
input : Gaurang
output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]
*/

package jaykumar;

import java.util.ArrayList;

public class Assignment78 {
	
	ArrayList<String> replaceName(ArrayList<String> listOfNames, String oldName, String newName){
		while(listOfNames.contains(oldName)){
			listOfNames.set(listOfNames.indexOf(oldName), newName);
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		Assignment78 a = new Assignment78();
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
		System.out.println("Given list: "+listOfNames);
		System.out.println("Updated list: "+a.replaceName(listOfNames, "Gaurang", "Rahul"));
	}
}
