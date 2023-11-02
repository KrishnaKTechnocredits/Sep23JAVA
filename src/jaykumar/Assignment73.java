/*Assignment-73 : 1st Nov'2023
Insert number 100 at the index of first negative number.
input : [13,44,67,-22,14,55,-44,12,-3]
output : [13,44,67,100,-22,14,55,-44,12,-3]*/

package jaykumar;

import java.util.ArrayList;

public class Assignment73 {

	static void insertNum(ArrayList<Integer> listOfNum) {
		System.out.println("Given list of num: "+listOfNum);
		for(int index=0; index<listOfNum.size(); index++) {
			int num = listOfNum.get(index);
			if(num<0) {
				listOfNum.add(index, 100);
				break;
			}
		}
		System.out.println("Output List; "+listOfNum);
	}
	public static void main(String[] args) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(13);
		listOfNum.add(44);
		listOfNum.add(67);
		listOfNum.add(-22);
		listOfNum.add(14);
		listOfNum.add(55);
		listOfNum.add(-44);
		listOfNum.add(12);
		listOfNum.add(-3);
		Assignment73.insertNum(listOfNum);
	}
}
