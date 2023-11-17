/*Assignment-91 : 10th Nov'2023
WAP to sort Employee based on different attributes.
Employee class attributes : empName, empid, deptId, deptName, salary, yearsOfExp
Sorting can be applicable on salary, yearsOfExp, empName
Hint : use Comparator interface. */
package shrutika;

import java.util.Comparator;

public class As91SalaryComparator implements Comparator<As91Employee>{

	@Override
	public int compare(As91Employee emp1, As91Employee emp2) {
		return emp1.salary - emp2.salary;
	}
}
