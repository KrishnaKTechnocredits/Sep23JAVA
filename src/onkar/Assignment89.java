/*Return a unique set of Employee, considering below attribute (instance variable) in employee class.
These attribute should be initialised from Constructor. 

empname, empid, deptName, salary, yearsOfExp

NOTE : if all attribute are same between two employees then only consider them as duplicate.*/ 

package onkar;

public class Assignment89 {
	
	String empname;
	int empid;
	String deptName;
	int salary;
	int yearsOfExp;
	
	public Assignment89(String empname, int empid, String deptName, int salary, int yearsOfExp) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.deptName = deptName;
		this.salary = salary;
		this.yearsOfExp = yearsOfExp;
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		Assignment89 a = (Assignment89) obj;
		return this.empname.equals(a.empname) && this.empid==a.empid && this.deptName.equals(a.deptName) && this.salary==a.salary && this.yearsOfExp==a.yearsOfExp;
	}
}
