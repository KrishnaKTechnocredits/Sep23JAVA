/*wap to return list of names having frequency more then 1 from given ArrayList*/

package hetal;

import java.util.ArrayList;

public class Assignment72 {

	ArrayList<String> getFrequency(ArrayList<String> listOfNames) {
		ArrayList<String> targetValues = new ArrayList<String>();
		for (int index = 0; index < listOfNames.size(); index++) {
			String x = listOfNames.get(index);
			if (listOfNames.indexOf(x) != listOfNames.lastIndexOf(x)) {
				if(!targetValues.contains(x))
				targetValues.add(x);
			}
		}
		return targetValues;

	}

	public static void main(String[] args) {
		ArrayList<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Hetal");
		listOfNames.add("jay");
		listOfNames.add("Hetal");
		listOfNames.add("Sakshi");
		listOfNames.add("Hetal");
		listOfNames.add("Sakshi");
		listOfNames.add("Shrutika");
		listOfNames.add("Sayali");

		System.out.println("input ArrayList : " + listOfNames);
		ArrayList<String> al = new Assignment72().getFrequency(listOfNames);
		System.out.println("frequency more than 1 in given ArrayList is : " + al);
	}

}
