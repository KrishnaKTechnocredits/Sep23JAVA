/*Write a method to print unique names from given ArrayList.

void getUniqueNameList(ArrayList<String> listOfNames){
	// Here add your logic
	
} */

package subramanian;

import java.util.ArrayList;

public class Assignment70 {

	void uniqueNameList(ArrayList<String> ListOfNames) {
		System.out.println("Unique Name list are as below");
		for (int index = 0; index < ListOfNames.size(); index++) {
			String input = ListOfNames.get(index);
			if (ListOfNames.indexOf(input) == ListOfNames.lastIndexOf(input)) {
				System.out.println(input);
			}
		}
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

		new Assignment70().uniqueNameList(a1);

	}

}
