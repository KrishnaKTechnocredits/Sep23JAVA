package denish;

import java.util.Set;
import java.util.TreeSet;

public class Assignment90_Client {

	public static void main(String[] args) {
		Assignment90_Student std1 = new Assignment90_Student("Denish", 1, 98, "Gujarat");
		Assignment90_Student std2 = new Assignment90_Student("Jigar", 5, 95, "Rajkot");
		Assignment90_Student std3 = new Assignment90_Student("Rushi", 7, 85, "Surat");
		Assignment90_Student std4 = new Assignment90_Student("Gaurang", 2, 81, "Jamnagar");
		Assignment90_Student std5 = new Assignment90_Student("Pavan", 3, 75, "Pune");

		Set<Assignment90_Student> setOfStudent = new TreeSet<Assignment90_Student>();
		setOfStudent.add(std1);
		setOfStudent.add(std2);
		setOfStudent.add(std3);
		setOfStudent.add(std4);
		setOfStudent.add(std5);

		System.out.println("Size of Student : " + setOfStudent.size());
		System.out.println(setOfStudent);
	}
}
