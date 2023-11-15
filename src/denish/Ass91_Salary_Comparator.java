package denish;

import java.util.Comparator;

public class Ass91_Salary_Comparator implements Comparator<Assignment91_Employee> {

	@Override
	public int compare(Assignment91_Employee emp1, Assignment91_Employee emp2) {
		return emp1.salary - emp2.salary;
	}
}
