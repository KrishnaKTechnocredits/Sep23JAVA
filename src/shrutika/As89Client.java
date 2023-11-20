/*Assignment-89 : 9th Nov'2023

Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 

empname, empid, deptName, salary, yearsOfExp

NOTE : if all attribute are same between two employees then only consider them as duplicate. */
package shrutika;

import java.util.HashSet;
import java.util.Set;

public class As89Client {

	public static void main(String[] args) {
		As89SetOfEmp employee1 = new As89SetOfEmp("Shrutika", 121, "QA", 5, 4);
		As89SetOfEmp employee2 = new As89SetOfEmp("Hetal", 123, "HR", 3, 1);
		As89SetOfEmp employee3 = new As89SetOfEmp("Swati", 125, "QA", 6, 7);
		As89SetOfEmp employee4 = new As89SetOfEmp("Pooja", 127, "ADMIN", 3, 6);
		As89SetOfEmp employee5 = new As89SetOfEmp("Shrutika", 121, "QA", 5, 4);
		As89SetOfEmp employee6 = new As89SetOfEmp("Swati", 129, "QA", 6, 7);

		Set<As89SetOfEmp> setOfEmployee = new HashSet<As89SetOfEmp>();
		setOfEmployee.add(employee1);
		setOfEmployee.add(employee2);
		setOfEmployee.add(employee3);
		setOfEmployee.add(employee4);
		setOfEmployee.add(employee5);
		setOfEmployee.add(employee6);

		System.out.println("Size of Set: " + setOfEmployee.size());
		System.out.println("Elements of Employee Set:");
		System.out.println(setOfEmployee);
	}
}
