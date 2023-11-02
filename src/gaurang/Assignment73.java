/*Insert number 100 at the index of first negative number.

input : [13,44,67,-22,14,55,-44,12,-3]
output : [13,44,67,100,-22,14,55,-44,12,-3]*/

package gaurang;

import java.util.ArrayList;

public class Assignment73 {

	ArrayList<Integer> getAdd(ArrayList<Integer> input){
		System.out.println("Given input : "+input);
		for(int index = 0; index< input.size(); index++) {
			int x = input.get(index);
			if(x<0) {
				input.add(index,100);
				break;
			}
		}
		return input;
	}
	
	public static void main(String[] args) {
		Assignment73 a = new Assignment73();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(13);
		al.add(44);
		al.add(67);
		al.add(-22);
		al.add(14);
		al.add(55);
		al.add(-44);
		al.add(12);
		al.add(-3);
		ArrayList<Integer> output = a.getAdd(al);
		System.out.println("Required output : "+output);
	}
}
