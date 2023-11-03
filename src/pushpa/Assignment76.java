//Assignment-76 : 2nd Nov'2023
//
//Remove all the duplicate values from the list. 
//
//input : {"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"}
//output : {"Techno", "Credits", "Hi", "Hello","Pune"}  
//
//hint : get(), indexOf(), lastIndexOf(), remove()

package pushpa;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment76 {

	public ArrayList<String> removeDuplicateString(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			String str = arrayList.get(i);
			if (arrayList.indexOf(str) != arrayList.lastIndexOf(str)) {
				arrayList.remove(arrayList.lastIndexOf(str));
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		Assignment76 assignment76 = new Assignment76();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Techno");
		arrayList.add("Credits");
		arrayList.add("Techno");
		arrayList.add("Hi");
		arrayList.add("Hello");
		arrayList.add("Pune");
		arrayList.add("Hi");
		System.out.println(arrayList);
		ArrayList<String> updatedArrayList = assignment76.removeDuplicateString(arrayList);
		System.out.println(updatedArrayList);
	}
}
