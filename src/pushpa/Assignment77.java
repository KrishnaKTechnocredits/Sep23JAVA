//Assignment-77 : 2nd Nov'2023
//
//Remove all occurances of given name from ArrayList.
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
//output : [Sakshi, Swati, Onkar, Jay, Hetal, Nivedita, Onkar, Jyoti]
//
//while(listOfName.contains("Gaurang")){
//	listOfNames.remove("Gaurang");
//}

package pushpa;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment77 {

	public ArrayList<String> removeString(ArrayList<String> arrayList, String str) {
		while (arrayList.contains("Gaurang")) {
			arrayList.remove("Gaurang");
		}
		return arrayList;
	}

	public static void main(String[] args) {
		Assignment77 assignment77 = new Assignment77();
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
		ArrayList<String> updatedArrayList = assignment77.removeString(listOfNames, "Gaurang");
		System.out.println(updatedArrayList);
	}
}
