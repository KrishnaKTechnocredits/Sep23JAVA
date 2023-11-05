/*Remove all occurances of given "Gaurang" with "Rahul" in a given ArrayList.*/

package gaurang;

import java.util.ArrayList;

public class Assignment78 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sakshi");
		al.add("Swati");
		al.add("Gaurang");
		al.add("Onkar");
		al.add("Jay");
		al.add("Gaurang");
		al.add("Hetal");
		al.add("Nivedita");
		al.add("Onkar");
		al.add("Gaurang");
		al.add("Jyoti");
		System.out.println(al);
		while(al.contains("Gaurang")) {
			int x = al.indexOf("Gaurang");
			al.set(x, "Rahul");
		}
		System.out.println(al);
	}
}
