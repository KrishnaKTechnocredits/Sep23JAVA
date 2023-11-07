/*Remove all the duplicate values from the list. */

/*input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}*/
/*output : {"Techno", "Credits", "Hi", "Hello","Pune"} */ 

package hetal;

import java.util.ArrayList;

public class Assignment76 {
	
	ArrayList<String> getDublicate(ArrayList<String> input){
		for(int index=0;index<input.size();index++) {
			String str = input.get(index);
			if(input.indexOf(str)!=input.lastIndexOf(str)) {
				input.remove(input.lastIndexOf(str));
			}	
		}
		return input;
	}
	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("Techno");
		input.add("Credits");
		input.add("Techno");
		input.add("Hi");
		input.add("Hello");
		input.add("Pune");
		input.add("Hi");
		System.out.println("input :" +input);
		ArrayList<String> al = new Assignment76().getDublicate(input);
		System.out.println("output : " +al);
		
	}

}
