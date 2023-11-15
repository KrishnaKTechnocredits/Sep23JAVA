/*Assignment-90 : 9th Nov'2023
WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */
package swati_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ass90Student_Client {

	public static void main(String[] args) {
		Ass90Student student1 = new Ass90Student("Swati", 1, 86, "Pune");
		Ass90Student student2 = new Ass90Student("Shrutika", 9, 90, "Manglore");
		Ass90Student student3 = new Ass90Student("Savita", 7, 80, "Indore");
		Ass90Student student4 = new Ass90Student("Anamika", 8, 79, "Mumbai");
		Ass90Student student5 = new Ass90Student("Kavita", 9, 81, "Delhi");

		System.out.println("Sorting using TreeSet");
		Set<Ass90Student> setOfStudent = new TreeSet<Ass90Student>();
		setOfStudent.add(student1);
		setOfStudent.add(student2);
		setOfStudent.add(student3);
		setOfStudent.add(student4);
		setOfStudent.add(student5);
		System.out.println("Size of Student set is: " + setOfStudent.size());
		System.out.println("Elements of Student set are:");
		System.out.println(setOfStudent);

		System.out.println("*****************************************");

		System.out.println("Sorting the student using ArrayList");
		List<Ass90Student> listOfStudent = new ArrayList<Ass90Student>();
		listOfStudent.add(student1);
		listOfStudent.add(student2);
		listOfStudent.add(student3);
		listOfStudent.add(student4);
		listOfStudent.add(student5);
		System.out.println("Before sort:");
		System.out.println(listOfStudent);
		System.out.println("******************************************");
		Collections.sort(listOfStudent);
		System.out.println("After sort:");
		System.out.println(listOfStudent);
	}
}
