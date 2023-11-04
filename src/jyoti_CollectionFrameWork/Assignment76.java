package jyoti_CollectionFrameWork;

import java.util.ArrayList;

public class Assignment76 {

	ArrayList<String> removeDuplicates(ArrayList<String> stringList) {
		for (int index = 0; index < stringList.size(); index++) {
			String str = stringList.get(index);
			while (stringList.indexOf(str) != stringList.lastIndexOf(str)) {
				int lastIndex = stringList.lastIndexOf(str);
				stringList.remove(lastIndex);
			}
		}
		return stringList;
	}

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Techno");
		stringList.add("Credits");
		stringList.add("Techno");
		stringList.add("Hi");
		stringList.add("Hello");
		stringList.add("Pune");
		stringList.add("Hi");
		System.out.println("Original List-->" + stringList);
		System.out.println("=====================================");
		System.out.println("Processed ArrayList : " + new Assignment76().removeDuplicates(stringList));
	}
}
