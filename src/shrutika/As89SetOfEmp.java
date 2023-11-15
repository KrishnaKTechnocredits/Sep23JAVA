/*Assignment-89 : 9th Nov'2023

Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 

empname, empid, deptName, salary, yearsOfExp

NOTE : if all attribute are same between two employees then only consider them as duplicate. */
package shrutika;

public class As89SetOfEmp {

	String empName;
	int empId;
	String deptName;
	int salary;
	int yearsOfExp;

	public As89SetOfEmp(String empName, int empId, String deptName, int salary, int yearsOfExp) {
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
		As89SetOfEmp employee = (As89SetOfEmp) obj;
		return this.empName.equals(employee.empName) && this.empId == employee.empId
				&& this.deptName.equals(employee.deptName) && this.salary == employee.salary
				&& this.yearsOfExp == employee.yearsOfExp;
	}

	@Override
	public String toString() {
		return empName + ":" + empId + ":" + deptName + ":" + salary + ":" + yearsOfExp;
	}

}
