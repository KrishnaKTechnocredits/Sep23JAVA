//Write a method to print unique names from given ArrayList.
package aditya.Collection;
import java.util.ArrayList;

class Assignment70 {

	ArrayList<String> getUniqueNameList(ArrayList<String> Assignment70) {
		ArrayList<String> CP1 = new ArrayList<String>();
		for (int index = 0; index < Assignment70.size(); index++) {
			String name = Assignment70.get(index);

			if (Assignment70.indexOf(name) == Assignment70.lastIndexOf(name)) {
				CP1.add(name);
			}
			
		}
		System.out.println(CP1);
		return CP1;
	}

	public static void main(String[] args) {
		Assignment70 cp = new Assignment70();
		ArrayList<String> CP1 = new ArrayList<String>();
		CP1.add("sakshi");
		CP1.add("Nivedita");
		CP1.add("Swati");
		CP1.add("Nivedita");
		CP1.add("Onkar");
		CP1.add("Jay");
		CP1.add("Jyoti");
		CP1.add("Nivedita");
		cp.getUniqueNameList(CP1);
	}
}
