/*Assignment-89 : 9th Nov'2023
Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 
empname, empid, deptName, salary, yearsOfExp
NOTE : if all attribute are same between two employees then only consider them as duplicate. */

package jaykumar;

import java.util.HashSet;
import java.util.Set;

public class Assignment89_Client {

	public static void main(String[] args) {
		
		Assignment89_Employee emp1 = new Assignment89_Employee("Jay", 13, "ElecQA", 7, 4);
		Assignment89_Employee emp2 = new Assignment89_Employee("Onkar", 17, "RequirementQA", 7, 5);
		Assignment89_Employee emp3 = new Assignment89_Employee("Deepak", 18, "SystemsQA", 8, 6);
		Assignment89_Employee emp4 = new Assignment89_Employee("Yogesh", 8, "TraQA", 13, 3);
		Assignment89_Employee emp5 = new Assignment89_Employee("Jay", 13, "ElecQA", 7, 4);
		
		Set<Assignment89_Employee> setOfEmployee = new HashSet<Assignment89_Employee>();
		setOfEmployee.add(emp1);
		setOfEmployee.add(emp2);
		setOfEmployee.add(emp3);
		setOfEmployee.add(emp4);
		setOfEmployee.add(emp5);
		
		System.out.println("Size of Set: "+setOfEmployee.size());
		System.out.println("Elements of Employee Set:");
		System.out.println(setOfEmployee);
	}
}
