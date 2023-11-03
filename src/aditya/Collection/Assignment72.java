package aditya.Collection;

import java.util.ArrayList;

public class Assignment72 {

	ArrayList <String> getUniqueNameList(ArrayList<String> CP1) {
		ArrayList<String> CP2 = new ArrayList<String>();
		for (int index = 0; index < CP1.size(); index++) {
			String name = CP1.get(index);

			if (CP1.indexOf(name) != CP1.lastIndexOf(name)) {
				CP2.add(name);
			}

		}
		return CP2;
		
	}

	public static void main(String[] args) {
		ArrayList<String> CP1 = new ArrayList<String>();
		CP1.add("sakshi");
		CP1.add("Nivedita");
		CP1.add("Swati");
		CP1.add("Nivedita");
		CP1.add("Onkar");
		CP1.add("Jay");
		CP1.add("sakshi");
		CP1.add("Nivedita");
		System.out.println(CP1);
		System.out.println(new Assignment72().getUniqueNameList(CP1));
	}
}
