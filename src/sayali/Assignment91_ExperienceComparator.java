package sayali;

import java.util.Comparator;

public class Assignment91_ExperienceComparator implements Comparator<Assignment91_Employee>{

	@Override
	public int compare(Assignment91_Employee emp1, Assignment91_Employee emp2) {
		return emp1.yearsOfExp - emp2.yearsOfExp;
	}
}