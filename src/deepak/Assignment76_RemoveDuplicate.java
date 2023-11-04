/*Assignment-76 : 2nd Nov'2023

Remove all the duplicate values from the list. 

input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"}  

hint : get(), indexOf(), lastIndexOf(), remove()
*/

package deepak;

import java.util.ArrayList;

public class Assignment76_RemoveDuplicate {
	ArrayList<String> removeDuplicates(ArrayList<String> input) {
		System.out.println("Input : " + input);
		for (int index = 0; index < input.size(); index++) {
			String str = input.get(index);
			if (input.indexOf(str) != input.lastIndexOf(str))
				input.remove(input.lastIndexOf(str));
		}
		return input;
	}

	public static void main(String[] args) {
		Assignment76_RemoveDuplicate output = new Assignment76_RemoveDuplicate();
		ArrayList<String> input = new ArrayList<String>();
		input.add("Techno");
		input.add("Credits");
		input.add("Techno");
		input.add("Hi");
		input.add("Hello");
		input.add("Pune");
		input.add("Hi");

		// List<String> list = Arrays.asList({"Techno", "Credits", "Techno", "Hi",
		// "Hello","Pune","Hi"});
		System.out.println("Output : " + output.removeDuplicates(input));
	}
}