/*Write a program to print freq of each name using ArrayList.*/

package gaurang;

import java.util.ArrayList;

public class Assignment80 {

	void getCount(ArrayList<String> input) {
		for(int index = 0 ; index<input.size() ; ) {
			int count = 0;
			String x = input.get(index);
			while(input.contains(x)) {
				count++;
				input.remove(x);
			}
			System.out.println(x+"-->"+count);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Credits");
		al.add("Techno");
		al.add("Techno");
		al.add("Hello");
		al.add("Credits");
		new Assignment80().getCount(al);
	}
}
