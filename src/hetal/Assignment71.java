package hetal;

import java.util.ArrayList;

public class Assignment71 {
	

	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String> ();
		for (int index = 0; index < listOfNames.size(); index++) {
			String x = listOfNames.get(index);
			if (listOfNames.indexOf(x) == listOfNames.lastIndexOf(x)) {
				targetNameList.add(x);
			}
		}
		return targetNameList;	
		
	}
	
	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Hetal");
		listOfNames.add("Sayali");
		listOfNames.add("Swati");
		listOfNames.add("Jay");
		listOfNames.add("Denish");
		listOfNames.add("Gaurang");
		listOfNames.add("Sakshi");
		listOfNames.add("Denish");
		listOfNames.add("Hetal");
		listOfNames.add("Swati");
		System.out.println("input array list" + listOfNames);
		ArrayList<String> al =new Assignment71().getUniqueNameList(listOfNames);
		System.out.println("Unique names from given ArrayList are :" + al);
		

	}
}
