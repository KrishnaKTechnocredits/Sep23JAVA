package denish;

public class Employee {

	String empName;
	int empId;
	String deptName;
	int salary;
	int yearsOfExp;

	public Employee(String empName, int empId, String deptName, int salary, int yearsOfExp) {
		super();
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

	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee) obj;
		return this.empName.equals(emp.empName) && this.empId == emp.empId && this.deptName.equals(emp.deptName)
				&& this.salary == emp.salary && this.yearsOfExp == emp.yearsOfExp;
	}

	@Override
	public int hashCode() {
		return empId;
	}
}
