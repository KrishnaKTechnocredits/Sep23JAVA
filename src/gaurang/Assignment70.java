/*Write a method to print unique names from given ArrayList.*/

package gaurang;

import java.util.ArrayList;

public class Assignment70 {

	void getUniqName(ArrayList<String> input) {
		System.out.println("Given String is : ");
		System.out.println(input);
		System.out.println("Unique element in Given String : ");
		for(int index = 0 ; index < input.size() ; index++) {
			String x = input.get(index);
			if(input.indexOf(x) == input.lastIndexOf(x)) {
				System.out.println(x);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment70 a = new Assignment70();
		ArrayList<String> al = new ArrayList<String>();
		al.add("Gaurang");
		al.add("Deepak");
		al.add("Gaurang");
		al.add("Hetal");
		al.add("Kuldeep");
		al.add("Shivani");
		al.add("Jay");
		a.getUniqName(al);
	}
}
