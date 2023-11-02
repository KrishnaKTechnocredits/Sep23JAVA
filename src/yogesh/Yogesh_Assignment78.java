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

package yogesh;

import java.util.ArrayList;

public class Yogesh_Assignment78 {

	void getReplaceName(ArrayList<String> name, String toReplace, String replace) {
		System.out.println(name);
		while (name.contains(toReplace)) {
			int index = 0;
			index = name.indexOf(toReplace);
			name.set(index, replace);

		}
		System.out.println(name);
	}

	public static void main(String[] args) {
		Yogesh_Assignment78 assignment78 = new Yogesh_Assignment78();
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

		assignment78.getReplaceName(listOfNames, "Gaurang", "Rahul");
	}
}
