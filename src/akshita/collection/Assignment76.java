/*Remove all the duplicate values from the list. 
input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"}  */

package akshita.collection;

import java.util.ArrayList;

public class Assignment76 {

	void removeDuplicate(ArrayList<String> input) {
		for(int index=0;index<input.size();index++) {
			String input1 = input.get(index);
			if(input.indexOf(input1) != input.lastIndexOf(input1)) {
				input.remove(input.lastIndexOf(input1));
			}
		}
		System.out.println("Output : " + input);
	}
	
	public static void main(String[] args) {
		Assignment76 ass76 = new Assignment76();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Credits");
		al.add("Techno");
		al.add("Hi");
		al.add("Hello");
		al.add("Pune");
		al.add("Hi");
		System.out.println("Input : " + al);
		ass76.removeDuplicate(al);
	}
}
