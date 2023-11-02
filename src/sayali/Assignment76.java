/* WAP to Remove all the duplicate values from the list. 
input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"}
hint : get(), indexOf(), lastIndexOf(), remove() */

package sayali;

import java.util.ArrayList;

public class Assignment76 {

	ArrayList<String> getNameList(ArrayList<String> input) {
		for (int index = 0; index < input.size(); index++) {
			String x = input.get(index);
			if (input.indexOf(x) != input.lastIndexOf(x)) {
				input.remove(input.lastIndexOf(x));
			}
		}
		return input;
	}

	public static void main(String[] args) {
		
		Assignment76 ass76 = new Assignment76();
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Techno");
		listOfNames.add("Hi");
		listOfNames.add("Hello");
		listOfNames.add("Pune");
		listOfNames.add("Hi");
		System.out.println("Input : " + listOfNames);
		ArrayList<String> output = ass76.getNameList(listOfNames);
		System.out.println("\nOutput : " + output);
	}
}