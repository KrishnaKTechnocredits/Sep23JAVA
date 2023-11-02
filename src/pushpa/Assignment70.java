//Assignment-70 : 1st Nov'2023
//
//Write a method to print unique names from given ArrayList.
//
//void getUniqueNameList(ArrayList<String> listOfNames){
//	// Here add your logic
//	
//}

package pushpa;

import java.util.ArrayList;

public class Assignment70 {

	public void getUniqueNameList(ArrayList<String> arrayList) {
		System.out.println("List of name is :" + arrayList);
		for (int i = 0; i < arrayList.size(); i++) {
			String str = arrayList.get(i);
			if (arrayList.indexOf(str) == arrayList.lastIndexOf(str))
				System.out.println(str);
		}

	}

	public static void main(String[] args) {
		Assignment70 assignment70 = new Assignment70();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Pushpa");
		arrayList.add("Mau");
		arrayList.add("Pushpa");
		arrayList.add("Pravin");
		assignment70.getUniqueNameList(arrayList);
	}
}
