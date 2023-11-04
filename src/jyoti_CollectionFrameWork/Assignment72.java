/*
 Assignment-72 : 1st Nov'2023

Write a method to return list of names having frequency more than 1 from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} 

Hint : use indexOf() and lastIndexOf()
 */

package jyoti_CollectionFrameWork;

import java.util.ArrayList;

public class Assignment72 {

	ArrayList<String> getRepetitiveNameList(ArrayList<String> listOfNames) {
		ArrayList<String> targetNameList = new ArrayList<String>();
		for (int index = 0; index < listOfNames.size(); index++) {
			String input = listOfNames.get(index);
			if (listOfNames.indexOf(input) != listOfNames.lastIndexOf(input)) {
				if (!targetNameList.contains(input)) {
					targetNameList.add(input);
				}
			}
		}
		return targetNameList;
	}

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("Sakshi");
		arrlist.add("Nivedita");
		arrlist.add("Swati");
		arrlist.add("Nivedita");
		arrlist.add("Onkar");
		arrlist.add("Jay");
		arrlist.add("Hetal");
		arrlist.add("Jyoti");
		arrlist.add("Hetal");
		ArrayList<String> outputArraylist = new Assignment72().getRepetitiveNameList(arrlist);
		System.out.println("Original list ->" + arrlist);
		System.out.println("==========================================");
		System.out.println("Repetitive names list-> " + outputArraylist);
	}
}
