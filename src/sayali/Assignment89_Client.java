/* WAP to Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 

empname, empid, deptName, salary, yearsOfExp

NOTE : if all attribute are same between two employees then only consider them as duplicate */

package sayali;

import java.util.HashSet;
import java.util.Set;

public class Assignment89_Client {

	public static void main(String[] args) {

		Assignment89_Employee emp1 = new Assignment89_Employee("Sayali", 1, "SDET", 7, 4);
		Assignment89_Employee emp2 = new Assignment89_Employee("Swati", 2, "Full Stack", 7, 5);
		Assignment89_Employee emp3 = new Assignment89_Employee("Sakshi", 20, "Devops", 8, 6);
		Assignment89_Employee emp4 = new Assignment89_Employee("Nivedita", 12, "Salesforce", 13, 3);
		Assignment89_Employee emp5 = new Assignment89_Employee("Sayali", 1, "SDET", 7, 4);

		Set<Assignment89_Employee> uniqueSetOfEmployee = new HashSet<Assignment89_Employee>();
		uniqueSetOfEmployee.add(emp1);
		uniqueSetOfEmployee.add(emp2);
		uniqueSetOfEmployee.add(emp3);
		uniqueSetOfEmployee.add(emp4);
		uniqueSetOfEmployee.add(emp5);

		System.out.println("Size of Set: " + uniqueSetOfEmployee.size());
		System.out.println("\n Unique set of Employees:");
		System.out.println(uniqueSetOfEmployee);
	}
}