/*Assignment-70 : 1st Nov'2023 Write a method to print unique names from given ArrayList. 
void getUniqueNameList(ArrayList<String> listOfNames){ // Here add your logic }
*/
package swati;

import java.util.ArrayList;

public class Ass70UniqueNamesFromArrayList {
	
	void printUniqueNameList(ArrayList<String> listofnames) {
		System.out.println("Below are the unique elements of the given ArrayList:");
		for (int index = 0; index < listofnames.size(); index++) {
			String input = listofnames.get(index);
			if (listofnames.indexOf(input) == listofnames.lastIndexOf(input))
				System.out.println(input);
		}
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
		new Ass70UniqueNamesFromArrayList().printUniqueNameList(arrlist);
	}
}