/*Remove all occurances of given name from ArrayList.*/

package gaurang;

import java.util.ArrayList;

public class Assignment77 {

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
		al.add("Jyoti");
		al.add("Gaurang");
		System.out.println(al);
		while(al.contains("Gaurang")) {
			al.remove("Gaurang");
		}
		System.out.println(al);
	}
	
}
