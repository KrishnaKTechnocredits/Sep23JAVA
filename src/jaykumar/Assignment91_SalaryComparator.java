package jaykumar;

import java.util.Comparator;

public class Assignment91_SalaryComparator implements Comparator<Assignment91_Employee>{

	@Override
	public int compare(Assignment91_Employee emp1, Assignment91_Employee emp2) {
		return emp1.salary - emp2.salary;
	}
}
