//Assignment-78 : 2nd Nov'2023
//
//Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.
//
//ArrayList<String> listOfNames = new ArrayList<String>();
//		
//		listOfNames.add("Sakshi");
//		listOfNames.add("Swati");
//		listOfNames.add("Gaurang");
//		listOfNames.add("Onkar");
//		listOfNames.add("Jay"); // Techno // Jay
//		listOfNames.add("Gaurang");
//		listOfNames.add("Hetal");
//		listOfNames.add("Nivedita");
//		listOfNames.add("Onkar");
//		listOfNames.add("Gaurang");
//		listOfNames.add("Jyoti");
//
//input : Gaurang
//output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]
//
//while(listOfName.contains("Gaurang")){
//	listOfNames.remove("Gaurang");
//}
//	

package pushpa;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment78 {

	public ArrayList<String> replaceName(ArrayList<String> arrayList, String name ,  String newName) {
		
		while (arrayList.contains(name)) {
			arrayList.set(arrayList.indexOf(name), newName);
		}
		return arrayList;
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
		System.out.println(listOfNames);
		ArrayList<String> updatedArrayList = new Assignment78().replaceName(listOfNames,  "Gaurang", "Rahul");
		System.out.println(updatedArrayList);
	}
}
