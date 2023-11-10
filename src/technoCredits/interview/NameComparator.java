package technoCredits.interview;

import java.util.Comparator;

public class NameComparator implements Comparator<Builder>{

	@Override
	public int compare(Builder o1, Builder o2) {
		return o1.name.compareTo(o2.name);
	}
	
	

}
