/* WAP to Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 
empname, empid, deptName, salary, yearsOfExp
NOTE : if all attribute are same between two employees then only consider them as duplicate. */

package sayali;

public class Assignment89_Employee {
	String empName;
	int empId;
	String deptName;
	int salary;
	int yearsOfExp;

	Assignment89_Employee(String empName, int empId, String deptName, int salary, int yearsOfExp) {
		this.empName = empName;
		this.empId = empId;
		this.deptName = deptName;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}

	@Override
	public int hashCode() {
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		Assignment89_Employee emp = (Assignment89_Employee) obj;
		return this.empName.equals(emp.empName) && this.empId == emp.empId && this.deptName.equals(emp.deptName)
				&& this.salary == emp.salary && this.yearsOfExp == emp.yearsOfExp;
	}

	@Override
	public String toString() {
		return empName + ":" + empId + ":" + deptName + ":" + salary + ":" + yearsOfExp;
	}
}