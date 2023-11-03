/*Assignment-74 : 1st Nov'2023
return the list of all the prime numbers in a give list.
*/
package jaykumar;

import java.util.ArrayList;

public class Assignment74 {
	
	boolean isPrime(int num) {
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	ArrayList<Integer> getPrimeNum(ArrayList<Integer> listOfNum){
		ArrayList<Integer> targetNumList = new ArrayList<Integer>();
		System.out.println("Given list of num: "+listOfNum);
		for(int index=0; index<listOfNum.size(); index++) {
			int num = listOfNum.get(index);
			if(this.isPrime(num)) {
				targetNumList.add(num);
			}
		}
		return targetNumList;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(7);
		listOfNum.add(10);
		listOfNum.add(13);
		listOfNum.add(25);
		listOfNum.add(29);
		listOfNum.add(36);
		listOfNum.add(19);
		listOfNum.add(37);
		listOfNum.add(39);
		listOfNum.add(41);
		
		Assignment74 a = new Assignment74();
		System.out.println("List of prime num: "+a.getPrimeNum(listOfNum));
	}
}
