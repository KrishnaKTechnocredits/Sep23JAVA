/* WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */

package sayali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment90_Client {

	public static void main(String[] args) {
		Assignment90_Student stud1 = new Assignment90_Student("Sayali", 5, 90, "Pune");
		Assignment90_Student stud2 = new Assignment90_Student("Sakshi", 3, 93, "Pune");
		Assignment90_Student stud3 = new Assignment90_Student("Roshni", 4, 91, "Kolhapur");
		Assignment90_Student stud4 = new Assignment90_Student("Swati", 1, 92, "Mumbai");
		Assignment90_Student stud5 = new Assignment90_Student("Jyoti", 2, 94, "Satara");

		System.out.println("Sorting of Students using TreeSet:"	 + "");
		Set<Assignment90_Student> setOfStudent = new TreeSet<Assignment90_Student>();
		setOfStudent.add(stud1);
		setOfStudent.add(stud2);
		setOfStudent.add(stud3);
		setOfStudent.add(stud4);
		setOfStudent.add(stud5);
		System.out.println("Total size of Student set: " + setOfStudent.size());
		System.out.println("Elements of Student set:");
		System.out.println(setOfStudent);

		System.out.println("--------------------------------------------------------------");

		System.out.println("\nSorting of students using ArrayList: ");
		List<Assignment90_Student> listOfStudent = new ArrayList<Assignment90_Student>();
		listOfStudent.add(stud1);
		listOfStudent.add(stud2);
		listOfStudent.add(stud3);
		listOfStudent.add(stud4);
		listOfStudent.add(stud5);
		System.out.println("List of students before sort:");
		System.out.println(listOfStudent);
		System.out.println("--------------------------------------------------------------");
		Collections.sort(listOfStudent);
		System.out.println("List of students after sort:");
		System.out.println(listOfStudent);
	}
}