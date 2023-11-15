package denish;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assignment91_Client {

	public static void main(String[] args) {
		Assignment91_Employee emp1 = new Assignment91_Employee("Denish", 1, "IT", 70152, 5);
		Assignment91_Employee emp2 = new Assignment91_Employee("Gaurang", 2, "Manager", 85621, 9);
		Assignment91_Employee emp3 = new Assignment91_Employee("Sakshi", 3, "QA", 50425, 4);
		Assignment91_Employee emp4 = new Assignment91_Employee("Jyoti", 4, "Developer", 45836, 10);

		List<Assignment91_Employee> listOfEmployee = new ArrayList<Assignment91_Employee>();
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(emp4);
		System.out.println(listOfEmployee);
		System.out.println("===================================================");
		System.out.println("Employees are sorted based on Name:");
		Collections.sort(listOfEmployee, new Ass91_Name_Comparator());
		System.out.println(listOfEmployee);

		System.out.println("===================================================");

		Set<Assignment91_Employee> setOfEmployee = new TreeSet<Assignment91_Employee>(new Ass91_Salary_Comparator());
		setOfEmployee.add(emp1);
		setOfEmployee.add(emp2);
		setOfEmployee.add(emp3);
		setOfEmployee.add(emp4);
		System.out.println("Employees are sorted based on Salary:");
		System.out.println(setOfEmployee);

		System.out.println("===================================================");

		Set<Assignment91_Employee> setOfEmployee1 = new TreeSet<Assignment91_Employee>(new Ass91_YearExp_Comparator());
		setOfEmployee1.add(emp1);
		setOfEmployee1.add(emp2);
		setOfEmployee1.add(emp3);
		setOfEmployee1.add(emp4);
		System.out.println("Employees are sorted based on YearsOfExp:");
		System.out.println(setOfEmployee1);
	}
}
