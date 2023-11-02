/*Remove all the duplicate values from the list. 

input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
output : {"Techno", "Credits", "Hi", "Hello","Pune"} */

package gaurang;

import java.util.ArrayList;

public class Assignment76 {

	ArrayList<String> getName(ArrayList<String> input){
		for(int index=0 ; index<input.size() ; index++) {
			String x = input.get(index);
			if(input.indexOf(x)!=input.lastIndexOf(x)) {
				input.remove(input.lastIndexOf(x));
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		Assignment76 a = new Assignment76();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Credits");
		al.add("Techno");
		al.add("Hi");
		al.add("Hello");
		al.add("Pune");
		al.add("Hi");
		System.out.println("Given input : "+al);
		ArrayList<String> output = a.getName(al);
		System.out.println("Required output : "+output);
	}
}
