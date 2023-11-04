/*Assignment-76 : 2nd Nov'2023 Remove all the duplicate values from the list. input :
{"Techno", "Credits", "Techno", "Hi", "Hello","Pune","Hi"} output : {"Techno", 
"Credits", "Hi", "Hello","Pune"}   hint : get(), indexOf(), lastIndexOf(), remove()*/
package swati;

import java.util.ArrayList;

public class Ass76RemoveDuplicates {
	
	ArrayList<String> removeDuplicates(ArrayList<String> stringlist) {
		for (int index = 0; index < stringlist.size(); index++) {
			String str = stringlist.get(index);
			while (stringlist.indexOf(str) != stringlist.lastIndexOf(str)) {
				int lastIndex = stringlist.lastIndexOf(str);
				stringlist.remove(lastIndex);
			}
		}
		return stringlist;
	}

	public static void main(String[] args) {
		ArrayList<String> stringlist = new ArrayList<String>();
		stringlist.add("Techno");
		stringlist.add("Credits");
		stringlist.add("Techno");
		stringlist.add("Hi");
		stringlist.add("Hello");
		stringlist.add("Pune");
		stringlist.add("Hi");
		System.out.println("Processed ArrayList : " + new Ass76RemoveDuplicates().removeDuplicates(stringlist));
	}
}
