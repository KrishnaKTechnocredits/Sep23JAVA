/*Assignment-71 : 1st Nov'2023 Write a method to return unique list of names from
given ArrayList. ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames)
{ 	ArrayList<String> targetNameList = new ArrayList<String>(); 
// Here add your logic 	return targetNameList; } */
package shrutika;

import java.util.ArrayList;

public class As71ReturnUniqueListName {

	ArrayList<String> getUniqueNameList(ArrayList<String> listOfNames) {
		ArrayList<String> targetNameList = new ArrayList<String>();
		for (int index = 0; index < listOfNames.size(); index++) {
			String input = listOfNames.get(index);
			if (listOfNames.indexOf(input) == listOfNames.lastIndexOf(input)) {
				targetNameList.add(input);
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
		ArrayList<String> outputArraylist = new As71ReturnUniqueListName().getUniqueNameList(arrlist);
		System.out.println("Input ->" + arrlist);
		System.out.println("Unique names -> " + outputArraylist);
	}
}
