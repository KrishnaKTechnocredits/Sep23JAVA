/*
 Assignment-89 : 9th Nov'2023

Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 

empname, empid, deptName, salary, yearsOfExp

NOTE : if all attribute are same between two employees then only consider them as duplicate. 

class ClientEmployee{

	Set<Employee> getUniqueSetOfEmployee(){
		Employee employee1 = new Employee("Techno",123,"IT",30234,3);
		Set<Employee> empSet = new HashSet<Employee>();
		empSet.add(employee1);
	}

	main(){
		Set<Employee> setOfEmployee = new ClientEmployee().getUniqueSetOfEmployee();
		sop(setOfEmployee);
	}

}

 */
package jyoti_CollectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class Assignment89_Client {

	public static void main(String[] args) {
		Assignment89_Employee emp1 = new Assignment89_Employee("Jyoti", 101, "IT", 10000, 1);
		Assignment89_Employee emp2 = new Assignment89_Employee("Jaya", 10, "QA", 15000, 2);
		Assignment89_Employee emp3 = new Assignment89_Employee("Jagrati", 1, "Reports", 50000, 4);
		Assignment89_Employee emp4 = new Assignment89_Employee("Joseph", 201, "SME", 70000, 12);
		Assignment89_Employee emp5 = new Assignment89_Employee("Janhavi", 31, "BA", 75000, 9);

		Set<Assignment89_Employee> setOfEmp = new HashSet<Assignment89_Employee>();
		setOfEmp.add(emp1);
		setOfEmp.add(emp2);
		setOfEmp.add(emp3);
		setOfEmp.add(emp4);
		setOfEmp.add(emp5);

		System.out.println("Employee Size-->" + setOfEmp.size());
		System.out.println("Records under Employee set");
		System.out.println(setOfEmp);

	}
}
