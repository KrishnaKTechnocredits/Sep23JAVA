package jaykumar;

import java.util.ArrayList;

public class Assignment77 {
	
	ArrayList<String> removeName(ArrayList<String> listOfNames,String name){
		while(listOfNames.contains(name)) {
			listOfNames.remove(name);
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		Assignment77 a = new Assignment77();
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
		System.out.println("Given list of names: "+listOfNames);
		System.out.println("Updated list of names: "+a.removeName(listOfNames, "Gaurang"));
	}
}
