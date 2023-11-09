package naresh;

import java.util.ArrayList;

public class Assignment71 {
	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String>();
		System.out.println("given array "+listOfNames);
		for(int index = 0 ; index <listOfNames.size();index++) {
			String name = listOfNames.get(index);
		int firstIndex=	listOfNames.indexOf(name);
		int lastIndex =	listOfNames.lastIndexOf(name);
			if(firstIndex==lastIndex) {
				targetNameList.add(name);
				
				
			}
			
			
		}
		return targetNameList;
		
		
	}

	public static void main(String[] args) {
		Assignment71 a = new Assignment71();
		 ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Techno");
		listOfNames.add("Credits");
		listOfNames.add("Jay");
		listOfNames.add("Onkar");
		listOfNames.add("Rahul");
		listOfNames.add("Techno");
		listOfNames.add("Rahul");
		listOfNames.add("Credits");
		listOfNames.add("Gaurang");
		listOfNames.add("Denish");
		System.out.println(a.getUniqueNameList(listOfNames));
	}

}
/*
 * Assignment-71 : 1st Nov'2023
 *//*
 * Write a method to return unique list of names from given ArrayList.
 * 
 * ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
 * ArrayList<String> targetNameList = new ArrayList<String>(); // Here add your
 * logic return targetNameList; }
 */