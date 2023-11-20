/*Assignment-90 : 9th Nov'2023
WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */

package pushpa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment90_Main {

	public static void main(String[] args) {
		Assignment90_Student std1 = new Assignment90_Student("Pushpa", 12, 95, "Ahmednagar");
		Assignment90_Student std2 = new Assignment90_Student("Sakshee", 10, 98, "Akola");
		Assignment90_Student std3 = new Assignment90_Student("Aakruti", 7, 85, "Pune");
		Assignment90_Student std4 = new Assignment90_Student("Rasika", 1, 90, "Nashik");
		Assignment90_Student std5 = new Assignment90_Student("Shubhi", 2, 89, "Ahmednagar");
		
		System.out.println("Sorting using TreeSet");
		Set<Assignment90_Student> setOfStudent = new TreeSet<Assignment90_Student>();
		setOfStudent.add(std1);
		setOfStudent.add(std2);
		setOfStudent.add(std3);
		setOfStudent.add(std4);
		setOfStudent.add(std5);
		System.out.println("Student set:");
		System.out.println(setOfStudent);
		
		System.out.println("****************************************");
		
		System.out.println("Sorting using ArrayList");
		List<Assignment90_Student> listOfStudent = new ArrayList<Assignment90_Student>();
		listOfStudent.add(std1);
		listOfStudent.add(std2);
		listOfStudent.add(std3);
		listOfStudent.add(std4);
		listOfStudent.add(std5);
		System.out.println("Before sort:");
		System.out.println(listOfStudent);
		Collections.sort(listOfStudent);
		System.out.println("After sort:");
		System.out.println(listOfStudent);
	}
}
