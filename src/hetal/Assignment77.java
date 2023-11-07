
/*Remove all occurances of given name from ArrayList.*/
/*input : [Sakshi,Swati,Gaurang,Onkar,Jay,Gaurang,Hetal,Nivedita,Onkar,Gaurang,Jyoti]*/
/*output : [Sakshi,Swati, Onkar, Jay, Hetal, Nivedita, Onkar, Jyoti]*/

package hetal;

import java.util.ArrayList;

public class Assignment77 {
	
	ArrayList<String> getRemove(ArrayList<String> input){
		while(input.contains("Gaurang")) {
			input.remove("Gaurang");
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
		
		System.out.println("input : " +listOfNames);
		ArrayList<String> al = new Assignment77().getRemove(listOfNames);
		System.out.println("Output : " +al);
	}
	

}
