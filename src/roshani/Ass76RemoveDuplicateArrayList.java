/*Assignment-76 : 2nd Nov'2023

Remove all the duplicate values from the list. 

input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"}  

hint : get(), indexOf(), lastIndexOf(), remove()
*/

package roshani;

import java.util.ArrayList;

public class Ass76RemoveDuplicateArrayList {
	
	ArrayList<String> returnNameList(ArrayList<String> input) {
		for (int index = 0; index < input.size(); index++) {
			String str = input.get(index);
			if (input.indexOf(str) != input.lastIndexOf(str)) {
				input.remove(input.lastIndexOf(str));
			}
		}
		return input;
	}

	public static void main(String[] args) {

		Ass76RemoveDuplicateArrayList assignment76 = new Ass76RemoveDuplicateArrayList();
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Techno");
		listOfNames.add("Hi");
		listOfNames.add("Hello");
		listOfNames.add("Pune");
		listOfNames.add("Hi");
		System.out.println("Input ArrayList is: " + listOfNames);
		ArrayList<String> output = assignment76.returnNameList(listOfNames);
		System.out.println("Output ArrayList is : " + output);
	}
}
