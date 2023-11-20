/*Remove all the duplicate values from the list. 

input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"}  

hint : get(), indexOf(), lastIndexOf(), remove()*/

package nivedita;

import java.util.ArrayList;

public class A76RemoveDuplicate {
	
	ArrayList<String> removeDuplicates (ArrayList<String> input){
		for (int index=0; index<input.size(); index++) {
			String str = input.get(index);
			while(input.indexOf(str) != input.lastIndexOf(str)) {
				int lastIndex = input.lastIndexOf(str);
				input.remove(lastIndex);
			}
		}
		return input;
	}
	
	public static void main (String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("Techno");
		input.add("Credits");
		input.add("Techno");
		input.add("Hi");
		input.add("Hello");
		input.add("Pune");
		input.add("Hi");
		System.out.println("Processed ArrayList : "+new A76RemoveDuplicate().removeDuplicates(input));
	}
}
