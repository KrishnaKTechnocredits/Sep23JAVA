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

public class Assignment89_Employee {
	String empName;
	int empId;
	String deptName;
	int salary;
	int yearOfExp;

	Assignment89_Employee(String empName, int empId, String deptName, int salary, int yearOfExp) {
		this.empName = empName;
		this.empId = empId;
		this.deptName = deptName;
		this.salary = salary;
		this.yearOfExp = yearOfExp;

	}

	public int hashcode() {
		return empId;
	}

	public boolean equals(Object obj) {
		Assignment89_Employee emp = (Assignment89_Employee) obj;
		return this.empName.equals(emp.empName) && this.empId == emp.empId && this.deptName.equals(emp.deptName)
				&& this.salary == emp.salary && this.yearOfExp == emp.yearOfExp;
	}

	public String toString() {
		return empName + "-->" + empId + "-->" + deptName + "--->" + salary + "-->" + yearOfExp + "-->";
	}

}
