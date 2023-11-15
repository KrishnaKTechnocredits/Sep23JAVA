package swati_Collections;

public class Ass89Employee {

	String empName;
	int empId;
	String deptName;
	int salary;
	int yearsOfExp;

	public Ass89Employee(String empName, int empId, String deptName, int salary, int yearsOfExp) {
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
		Ass89Employee employee = (Ass89Employee) obj;
		return this.empName.equals(employee.empName) && this.empId == employee.empId && this.deptName.equals(employee.deptName)
				&& this.salary == employee.salary && this.yearsOfExp == employee.yearsOfExp;
	}

	@Override
	public String toString() {
		return empName + ":" + empId + ":" + deptName + ":" + salary + ":" + yearsOfExp;
	}

}
