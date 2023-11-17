/*Assignment-89 : 9th Nov'2023
Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 
empname, empid, deptName, salary, yearsOfExp
NOTE : if all attribute are same between two employees then only consider them as duplicate. */

package pushpa;

import java.util.HashSet;
import java.util.Set;

public class Assignment89_Main {

	public static void main(String[] args) {

		Assignment89_Employee emp1 = new Assignment89_Employee("pushpa", 14, "DEV", 5, 4);
		Assignment89_Employee emp2 = new Assignment89_Employee("sakshee", 17, "QA", 5, 5);
		Assignment89_Employee emp3 = new Assignment89_Employee("rashmi", 19, "BA", 8, 6);
		Assignment89_Employee emp4 = new Assignment89_Employee("varsha", 8, "DEV", 13, 3);
		Assignment89_Employee emp5 = new Assignment89_Employee("pushpa", 14, "DEV", 5, 4);

		Set<Assignment89_Employee> setOfEmployee = new HashSet<Assignment89_Employee>();
		setOfEmployee.add(emp1);
		setOfEmployee.add(emp2);
		setOfEmployee.add(emp3);
		setOfEmployee.add(emp4);
		setOfEmployee.add(emp5);
		System.out.println("Elements of Employee Set:");
		System.out.println(setOfEmployee);
	}
}
