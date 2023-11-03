/*Assignment-72 : 1st Nov'2023 Write a method to return list of names having
frequency more than 1 from given ArrayList.*/
package swati;

import java.util.ArrayList;

public class Ass72RepetitiveName {

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
		arrlist.add("shrutika");
		arrlist.add("snehal");
		arrlist.add("hetal");
		arrlist.add("jyoti");
		arrlist.add("jagrati");
		arrlist.add("swati");
		arrlist.add("sakshi");
		arrlist.add("shrutika");
		arrlist.add("hetal");
		arrlist.add("pushpa");
		arrlist.add("swati");
		arrlist.add("shrutika");
		ArrayList<String> outputArraylist = new Ass72RepetitiveName().getRepetitiveNameList(arrlist);
		System.out.println("Input ->" + arrlist);
		System.out.println("Repetitive Names -> " + outputArraylist);
	}
}
