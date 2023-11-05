/*Write a method to return unique list of names from given ArrayList.

ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames){
	ArrayList<String> targetNameList = new ArrayList<String>();
	// Here add your logic
	return targetNameList;
} */

package subramanian;

import java.util.ArrayList;

public class Assignment71 {

	ArrayList<String> uniqueNameList(ArrayList<String> listOfName) {
		ArrayList<String> targetNameList = new ArrayList<String>();
		for (int index = 0; index < listOfName.size(); index++) {
			String input = listOfName.get(index);
			if (listOfName.indexOf(input) == listOfName.lastIndexOf(input)) {
				targetNameList.add(input);
			}
		}
		return targetNameList;

	}

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Subbu");
		a1.add("Rama");
		a1.add("Ratan");
		a1.add("Rama");
		a1.add("Sumit");
		a1.add("Subbu");
		a1.add("Rahul");

		ArrayList<String> outputArr = new Assignment71().uniqueNameList(a1);
		System.out.println("Input ArrayList is:" + a1);
		System.out.println("Unique names from array list are: " + outputArr);

	}

}
