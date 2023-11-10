package technoCredits.interview;

import java.util.Comparator;

public class YearsOfExpComparator implements Comparator<Builder>{

	@Override
	public int compare(Builder o1, Builder o2) {
		return o1.yearsOfExp - o2.yearsOfExp;
	}
}
