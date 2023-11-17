/*Assignment-91 : 10th Nov'2023
WAP to sort Employee based on different attributes.
Employee class attributes : empName, empid, deptId, deptName, salary, yearsOfExp
Sorting can be applicable on salary, yearsOfExp, empName
Hint : use Comparator interface. */

package pushpa;

public class Assignment91_Employee {
	String empName;
	int empId;
	String deptName;
	int salary;
	int yearsOfExp;

	Assignment91_Employee(String empName, int empId, String deptName, int salary, int yearsOfExp) {
		this.empName = empName;
		this.empId = empId;
		this.deptName = deptName;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}

	@Override
	public String toString() {
		return empName + ":" + empId + ":" + deptName + ":" + salary + ":" + yearsOfExp;
	}
}
