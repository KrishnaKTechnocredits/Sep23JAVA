package denish;

import java.util.Comparator;

public class Ass91_YearExp_Comparator implements Comparator<Assignment91_Employee> {

	@Override
	public int compare(Assignment91_Employee o1, Assignment91_Employee o2) {
		return o1.yearsOfExp - o2.yearsOfExp;
	}

}
