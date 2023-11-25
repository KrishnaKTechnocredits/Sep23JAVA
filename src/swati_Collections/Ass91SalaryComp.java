package swati_Collections;

import java.util.Comparator;

public class Ass91SalaryComp implements Comparator<Ass91Employee>{

	@Override
	public int compare(Ass91Employee emp1, Ass91Employee emp2) {
		return emp1.salary - emp2.salary;
	}
}
