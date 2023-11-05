/*Insert number 100 at the index of first negative number.*/

/*input : [13,44,67,-22,14,55,-44,12,-3]*/
/*output : [13,44,67,100,-22,14,55,-44,12,-3]*/

package hetal;

import java.util.ArrayList;

public class Assignment73 {
	
	ArrayList<Integer>getNegativeNum(ArrayList<Integer> num){
		//ArrayList<Integer> targetValues = new ArrayList<Integer>();
		 int NumIndex = 0;
		for(int index=0;index<num.size();index++) {
			int n = num.get(index);
			if(n<0) {
				NumIndex = index;
				break;
			}
		}
		num.add(NumIndex,100);
		return num;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(13);
		num.add(44);
		num.add(67);
		num.add(-22);
		num.add(14);
		num.add(55);
		num.add(-44);
		num.add(12);
		num.add(-3);
		
		System.out.println("input ArrayList : " +num);
		ArrayList<Integer> al = new Assignment73().getNegativeNum(num);
		System.out.println("New ArrayList : " +al);
	}

}
