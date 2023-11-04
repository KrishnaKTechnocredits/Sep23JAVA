package jyoti_CollectionFrameWork;

import java.util.ArrayList;

public class Assignment71 {

	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> targetListNames = new ArrayList<String>();
		System.out.println("Unique Name list ");
		System.out.println("===========================");
		for (int index = 0; index < listOfNames.size(); index++) {
			String name = listOfNames.get(index);
			if (listOfNames.indexOf(name) == listOfNames.lastIndexOf(name)) {
				targetListNames.add(name);
				System.out.println(name);
			}
		}
		return targetListNames;
	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Sakshi");
		listOfNames.add("Nivedita");
		listOfNames.add("Swati");
		listOfNames.add("Nivedita");
		listOfNames.add("Onkar");
		listOfNames.add("Jay");
		listOfNames.add("Hetal");
		listOfNames.add("Jyoti");
		listOfNames.add("Hetal");
		System.out.println("Original list ");
		System.out.println(listOfNames);
		new Assignment71().getUniqueNameList(listOfNames);
	}
}
