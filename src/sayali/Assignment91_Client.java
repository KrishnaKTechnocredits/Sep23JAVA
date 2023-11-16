/* WAP to sort Employee based on different attributes.
Employee class attributes : empName, empid, deptId, deptName, salary, yearsOfExp
Sorting can be applicable on salary, yearsOfExp, empName
Hint : use Comparator interface. */

package sayali;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment91_Client {

	public static void main(String[] args) {
		Assignment91_Employee emp1 = new Assignment91_Employee("Sakshi", 1, "SDET", 9, 8);
		Assignment91_Employee emp2 = new Assignment91_Employee("Sayali", 2, "Full Stack", 11, 4);
		Assignment91_Employee emp3 = new Assignment91_Employee("Nivedita", 3, "Automation", 8, 11);
		Assignment91_Employee emp4 = new Assignment91_Employee("Jyoti", 4, "Devops", 10, 12);

		List<Assignment91_Employee> listOfEmployee = new ArrayList<Assignment91_Employee>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(emp4);
		System.out.println("Employee List:");
		System.out.println(listOfEmployee);
		System.out.println("-------------------------------------------------------------------------------------------------");
		System.out.println("Sorting of Employees based on Employee Name: ");
		Collections.sort(listOfEmployee, new Assignment91_NameComparator());
		System.out.println(listOfEmployee);

		System.out.println("=================================================================================================");

		Set<Assignment91_Employee> setOfEmployee = new TreeSet<Assignment91_Employee>(new Assignment91_SalaryComparator());
		setOfEmployee.add(emp1);
		setOfEmployee.add(emp2);
		setOfEmployee.add(emp3);
		setOfEmployee.add(emp4);
		System.out.println("Sorting of Employess based on Salary: ");
		System.out.println(setOfEmployee);

		System.out.println("=================================================================================================");

		Set<Assignment91_Employee> setOfEmployee1 = new TreeSet<Assignment91_Employee>(new Assignment91_ExperienceComparator());
		setOfEmployee1.add(emp1);
		setOfEmployee1.add(emp2);
		setOfEmployee1.add(emp3);
		setOfEmployee1.add(emp4);
		System.out.println("Sorting of Employess based on years Of Experience: ");
		System.out.println(setOfEmployee1);
	}
}