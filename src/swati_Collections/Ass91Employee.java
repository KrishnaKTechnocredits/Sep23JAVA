package swati_Collections;

public class Ass91Employee {
	String empName;
	int empId;
	String deptName;
	int salary;
	int yearsOfExp;

	Ass91Employee(String empName, int empId, String deptName, int salary, int yearsOfExp) {
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
