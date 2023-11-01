/*Assignment-70 : 1st Nov'2023

Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
} 
*/

package roshani;

import java.util.ArrayList;

public class Ass70UniqueNamesArrayList {
	
	void getUniqueNameList(ArrayList<String> listOfNames) {
		System.out.println("Input list is: "+ listOfNames);
		System.out.println("\nUnique names are: ");
		
		for(int index = 0; index < listOfNames.size(); index++) {
			String output = listOfNames.get(index);
			if(listOfNames.indexOf(output) == listOfNames.lastIndexOf(output)){
				System.out.println(output);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		
		listOfNames.add("Sakshi");
		listOfNames.add("Nivedita");
		listOfNames.add("Swati");
		listOfNames.add("Roshni");
		listOfNames.add("Jyoti");
		listOfNames.add("Roshni");
		listOfNames.add("Sakshi");
		listOfNames.add("Jyoti");
		
		//System.out.println(targetNameList);
		
		new Ass70UniqueNamesArrayList().getUniqueNameList(listOfNames);
	}
}
