package aditya.Collection;

import java.util.ArrayList;

class Assignment73 {

	void getUniqueNameList(ArrayList<Integer> Number) {
		
		for (int index = 0; index < Number.size(); index++) {
			int num = Number.get(index);
			if (num < 0) {
				Number.add(index, 100);
				break;
			}
		}
		System.out.println(Number);

	}

	public static void main(String[] args) {
		ArrayList<Integer> CP1 = new ArrayList<Integer>();		
		CP1.add(13);
		CP1.add(44);
		CP1.add(67);
		CP1.add(-22);
		CP1.add(14);
		CP1.add(55);
		CP1.add(-44);
		CP1.add(12);
		CP1.add(-3);
		
		System.out.println(CP1);
		new Assignment73().getUniqueNameList(CP1);

	}
}
