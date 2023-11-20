/*Assignment-89 : 9th Nov'2023
Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 
empname, empid, deptName, salary, yearsOfExp
NOTE : if all attribute are same between two employees then only consider them as duplicate. */
package swati_Collections;

import java.util.HashSet;
import java.util.Set;

public class Ass89Employee_Client {

	public static void main(String[] args) {
		Ass89Employee employee1 = new Ass89Employee("Swati", 435, "SAP", 2, 1);
		Ass89Employee employee2 = new Ass89Employee("Shrutika", 297, "ADP", 2, 2);
		Ass89Employee employee3 = new Ass89Employee("Sonali", 547, "HR", 3, 5);
		Ass89Employee employee4 = new Ass89Employee("Nikita", 124, "SE", 4, 8);
		Ass89Employee employee5 = new Ass89Employee("Swati", 435, "SAP", 2, 1);

		Set<Ass89Employee> setOfEmployee = new HashSet<Ass89Employee>();
		setOfEmployee.add(employee1);
		setOfEmployee.add(employee2);
		setOfEmployee.add(employee3);
		setOfEmployee.add(employee4);
		setOfEmployee.add(employee5);

		System.out.println("Size of Set: " + setOfEmployee.size());
		System.out.println("Set of Employees are listed below:");
		System.out.println(setOfEmployee);
	}
}
