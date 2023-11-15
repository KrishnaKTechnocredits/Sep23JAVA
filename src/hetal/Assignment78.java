/*Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.*/
/*input : [Sakshi, Swati ,Gaurang, Onkar, Jay,Gaurang, Hetal, Nivedita, Onkar, Gaurang, Jyoti]*/
/*output : [Sakshi, Swati, Rahul, Onkar, Jay, Rahul, Hetal, Nivedita, Onkar, Rahul, Jyoti]*/

package hetal;

import java.util.ArrayList;

public class Assignment78 {

	ArrayList<String> getReplace(ArrayList<String> input) {
		while (input.contains("Gaurang")) {
			int x = input.indexOf("Gaurang");
			input.set(x, "Rahul");
		}
		return input;
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

		System.out.println("input : " + listOfNames);

		ArrayList<String> al = new Assignment78().getReplace(listOfNames);
		System.out.println("output : " + al);

	}

}
