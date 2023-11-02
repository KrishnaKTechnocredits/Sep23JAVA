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

package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment77 {
	void getNames(ArrayList<String> listOfNames, String toReplace) {
		System.out.println(listOfNames);
		while (listOfNames.contains(toReplace)) {
			listOfNames.remove(toReplace);
		}
		System.out.println(listOfNames);
	}

	public static void main(String[] args) {
		Yogesh_Assignment77 assignment77 = new Yogesh_Assignment77();
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
		assignment77.getNames(listOfNames, "Gaurang");
	}
}
