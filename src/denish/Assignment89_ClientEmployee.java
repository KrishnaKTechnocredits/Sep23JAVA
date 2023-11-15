/*Assignment-89 : 9th Nov'2023

Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 

empname, empid, deptName, salary, yearsOfExp

NOTE : if all attribute are same between two employees then only consider them as duplicate. */
package denish;

import java.util.HashSet;
import java.util.Set;

public class Assignment89_ClientEmployee {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Denish", 1234, "IT", 50000, 5);
		Employee employee2 = new Employee("Jigar", 1256, "HR", 42103, 4);
		Employee employee3 = new Employee("Gaurang", 4523, "Dev", 60423, 8);
		Employee employee4 = new Employee("Pavan", 5623, "IT", 45862, 2);
		Employee employee5 = new Employee("Denish", 1234, "IT", 50000, 5);

		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(employee1);
		empSet.add(employee2);
		empSet.add(employee3);
		empSet.add(employee4);
		empSet.add(employee5);

		System.out.println("Size of Element " + empSet.size());
		System.out.println(empSet);
	}
}
