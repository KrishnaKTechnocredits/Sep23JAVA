/*Write a program to print freq of each number using ArrayList*/

package gaurang;

import java.util.ArrayList;

public class Assignment79 {

	void getCount(ArrayList<Integer> input) {
		System.out.println(input);
		for(int index = 0 ; index<input.size() ;) {
			int count = 0;
			Integer x = input.get(index);
			for(int innerindex = 0 ; innerindex<input.size() ; innerindex++) {
				int y = input.get(innerindex);
				if(x==y) {
					count++;
				}
			}
			System.out.println(x+"-->"+count);
			while(input.contains(x)) {
				input.remove(x);
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(10);
		al.add(11);
		al.add(11);
		al.add(13);
		new Assignment79().getCount(al);
	}
}
