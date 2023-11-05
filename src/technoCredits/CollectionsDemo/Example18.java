package technoCredits.CollectionsDemo;

import java.util.ArrayList;

public class Example18 {

	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		//ArrayList<Integer> al2 = null;

		al1.add(13);
		al1.add(15);
		al1.add(17);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(19);
		al2.add(15);
		al2.add(177);
		al2.add(17);

		al1.retainAll(al2);

		System.out.println(al1.size());
		//System.out.println(al2.size());

	}
}
