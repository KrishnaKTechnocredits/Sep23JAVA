/*Insert number 100 at the index of first negative number.

input : [13,44,67,-22,14,55,-44,12,-3]
output : [13,44,67,100,-22,14,55,-44,12,-3]*/

package onkar;

import java.util.ArrayList;

public class Assignment73 {
	
	ArrayList<Integer> insertNumber(ArrayList<Integer> input){
		int negativeNumberIndex = 0;
		for (int index=0; index<input.size(); index++) {
			int number = input.get(index);
			if (number<0) {
				negativeNumberIndex = index;
				break;
 			}
		}
		input.add(negativeNumberIndex, 100);
		return input;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(13);
		a1.add(44);
		a1.add(67);
		a1.add(-22);
		a1.add(14);
		a1.add(55);
		a1.add(-44);
		a1.add(12);
		a1.add(-3);
		System.out.println("Output ArrayList is : "+new Assignment73().insertNumber(a1));
	}
}
