/*Assignment-90 : 9th Nov'2023
WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */

package shrutika;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class As90Client {

	public static void main(String[] args) {
		As90Student std1 = new As90Student("Shrutika", 5, 83, "Pune");
		As90Student std2 = new As90Student("Swati", 7, 92, "Pune");
		As90Student std3 = new As90Student("Hetal", 8, 80, "Gujrat");
		As90Student std4 = new As90Student("Shruthti", 9, 91, "Belgaum");
		As90Student std5 = new As90Student("Pooja", 4, 94, "Manglore");

		System.out.println("Sorting the Student using TreeSet");
		Set<As90Student> setOfStudent = new TreeSet<As90Student>();
		setOfStudent.add(std1);
		setOfStudent.add(std2);
		setOfStudent.add(std3);
		setOfStudent.add(std4);
		setOfStudent.add(std5);
		System.out.println("Size of Student set: " + setOfStudent.size());
		System.out.println("Elements of Student set:");
		System.out.println(setOfStudent);

		System.out.println("\nSorting the student using ArrayList [sort method]");
		List<As90Student> listOfStudent = new ArrayList<As90Student>();
		listOfStudent.add(std1);
		listOfStudent.add(std2);
		listOfStudent.add(std3);
		listOfStudent.add(std4);
		listOfStudent.add(std5);
		System.out.println("Before sort:");
		System.out.println(listOfStudent);

		Collections.sort(listOfStudent);
		System.out.println("\nAfter sort:");
		System.out.println(listOfStudent);
	}
}
