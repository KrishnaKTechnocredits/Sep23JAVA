package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example19 {

	public static void main(String[] args) {
		int evenSum = 0;
		ArrayList<Integer> al1 = new ArrayList<Integer>();

		al1.add(13);
		al1.add(16);
		al1.add(17);
		al1.add(34);

		/*
		 * for (int index = 0; index < al1.size(); index++) { int num = al1.get(index);
		 * System.out.println(num); if (num % 2 == 0) evenSum = evenSum + num; }
		 */

		for (int num : al1) {
			System.out.println(num);
			if (num % 2 == 0)
				evenSum = evenSum + num;
			if(evenSum >10)
				break;
		}
		System.out.println(evenSum);

	}
}
