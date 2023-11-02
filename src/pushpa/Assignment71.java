//Assignment-71 : 1st Nov'2023
//
//Write a method to return unique list of names from given ArrayList.
//
//ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
//	ArrayList<String> targetNameList = new ArrayList<String>();
//	// Here add your logic
//	return targetNameList;
//} 

package pushpa;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment71 {

	public ArrayList<String> getUniqueNameList(ArrayList<String> arrayList) {
		System.out.println("List of name is :" + arrayList);
		ArrayList<String> listOfUniqueNames = new ArrayList<String>();
		for (int i = 0; i < arrayList.size(); i++) {
			String str = arrayList.get(i);
			if (arrayList.indexOf(str) == arrayList.lastIndexOf(str))
				listOfUniqueNames.add(str);
		}
		return listOfUniqueNames;
	}

	public static void main(String[] args) {
		Assignment71 assignment71 = new Assignment71();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Pushpa");
		arrayList.add("Mau");
		arrayList.add("Pushpa");
		arrayList.add("Pravin");
		ArrayList<String> listOfUniqueNames = assignment71.getUniqueNameList(arrayList);
		System.out.println("List of Unique Name is :"+ listOfUniqueNames);
	}
}
