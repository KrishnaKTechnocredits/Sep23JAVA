/*Write a method to return list of names having frequency more than 1 from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
}*/

package nivedita;

import java.util.ArrayList;

public class A72ReturnNames {

	ArrayList<String> getRepeatNameList(ArrayList<String> listOfNames){
		ArrayList<String> targetNameList = new ArrayList<String>();
		for (int index=0; index<listOfNames.size(); index++) {
			String input = listOfNames.get(index);
			if (listOfNames.indexOf(input) != listOfNames.lastIndexOf(input)) {
				if(!targetNameList.contains(input)) {
					targetNameList.add(input);
				}
			}
		}
		return targetNameList;
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Onkar");
		a1.add("jay");
		a1.add("narendra");
		a1.add("rahul");
		a1.add("Onkar");
		a1.add("swati");
		a1.add("sakshi");
		a1.add("rahul");
		a1.add("hetal");
		a1.add("jay");
		a1.add("denish");
		a1.add("rahul");
		ArrayList<String> outputArrList = new A72ReturnNames().getRepeatNameList(a1);
		System.out.println("Input ArrayList is : "+a1);
		System.out.println("Names having frequency more than 1 :"+outputArrList);
	}
}
