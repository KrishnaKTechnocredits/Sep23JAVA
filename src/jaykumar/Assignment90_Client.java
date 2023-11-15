/*Assignment-90 : 9th Nov'2023
WAP to sort Student based on score.
Student class attributes : name, rno, marks, city
Hint : use Comparable interface. */

package jaykumar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment90_Client {

	public static void main(String[] args) {
		Assignment90_Student std1 = new Assignment90_Student("Jay", 1, 92, "Pune");
		Assignment90_Student std2 = new Assignment90_Student("Onkar", 5, 93, "Sangli");
		Assignment90_Student std3 = new Assignment90_Student("Rahul", 7, 90, "Pune");
		Assignment90_Student std4 = new Assignment90_Student("Deepak", 2, 91, "Mumbai");
		Assignment90_Student std5 = new Assignment90_Student("Rushi", 3, 88, "Satara");
		
		System.out.println("Sorting the Student using TreeSet");
		Set<Assignment90_Student> setOfStudent = new TreeSet<Assignment90_Student>();
		setOfStudent.add(std1);
		setOfStudent.add(std2);
		setOfStudent.add(std3);
		setOfStudent.add(std4);
		setOfStudent.add(std5);
		System.out.println("Size of Student set: "+setOfStudent.size());
		System.out.println("Elements of Student set:");
		System.out.println(setOfStudent);
		
		System.out.println("=============================================");
		
		System.out.println("Sorting the student using ArrayList [sort method]");
		List<Assignment90_Student> listOfStudent = new ArrayList<Assignment90_Student>();
		listOfStudent.add(std1);
		listOfStudent.add(std2);
		listOfStudent.add(std3);
		listOfStudent.add(std4);
		listOfStudent.add(std5);
		System.out.println("Before sort:");
		System.out.println(listOfStudent);
		System.out.println("---------------------------------------------");
		Collections.sort(listOfStudent);
		System.out.println("After sort:");
		System.out.println(listOfStudent);
	}
}
