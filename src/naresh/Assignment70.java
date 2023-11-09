package naresh;

import java.util.ArrayList;

public class Assignment70 {
	void getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> output = new ArrayList<String>(); 
		
		for(int index = 0; index <listOfNames.size();index++) {
			
		 String name =	listOfNames.get(index);
		int firstIndex= listOfNames.indexOf(name);
		int lastIndex =listOfNames.lastIndexOf(name);
		 if (firstIndex==lastIndex) {
				output.add(name);
		}			
		}
		System.out.println(output);	
	}
	public static void main(String[] args) {
		Assignment70 a = new Assignment70();
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("sakshi");
		listOfNames.add("nivadita");
		listOfNames.add("swati");
		listOfNames.add("nevedita");
		listOfNames.add("jay");
		listOfNames.add("jyoti");
		listOfNames.add("nevedita");
		a.getUniqueNameList(listOfNames);
		
	}
}
/*
 * Write a method to print unique names from given ArrayList.
 * 
 * void getUniqueNameList(ArrayList<String> listOfNames){ // Here add your logic
 * 
 * }
 */