/*Assignment-91 : 10th Nov'2023
WAP to sort Employee based on different attributes.
Employee class attributes : empName, empid, deptId, deptName, salary, yearsOfExp
Sorting can be applicable on salary, yearsOfExp, empName
Hint : use Comparator interface. */

package shrutika;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class As91Client {

	public static void main(String[] args) {
		As91Employee emp1 = new As91Employee("Shrutika", 11, "QA", 8, 5);
		As91Employee emp2 = new As91Employee("Swati", 22, "AutomationQA", 10, 8);
		As91Employee emp3 = new As91Employee("Spurti", 55, "QA", 7, 3);
		As91Employee emp4 = new As91Employee("Pooja", 75, "Dev", 4, 4);

		List<As91Employee> listOfEmployee = new ArrayList<As91Employee>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(emp4);
		System.out.println("Given Employee Data:");
		System.out.println(listOfEmployee);

		System.out.println("\nEmployees are sorted based on Name:");
		Collections.sort(listOfEmployee, new As91NameComparator());
		System.out.println(listOfEmployee);

		Set<As91Employee> setOfEmployee = new TreeSet<As91Employee>(new As91SalaryComparator());
		setOfEmployee.add(emp1);
		setOfEmployee.add(emp2);
		setOfEmployee.add(emp3);
		setOfEmployee.add(emp4);
		System.out.println("\nEmployees are sorted based on Salary:");
		System.out.println(setOfEmployee);

		Set<As91Employee> setOfEmployee1 = new TreeSet<As91Employee>(new As91ExpComparator());
		setOfEmployee1.add(emp1);
		setOfEmployee1.add(emp2);
		setOfEmployee1.add(emp3);
		setOfEmployee1.add(emp4);
		System.out.println("\nEmployees are sorted based on YearsOfExp:");
		System.out.println(setOfEmployee1);
	}
}
