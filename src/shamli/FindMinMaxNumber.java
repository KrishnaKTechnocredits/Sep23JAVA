/*Assignment - 7 : 5th Sep'2023 
Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.
sample input : 
	num1 : 10
	num2 : 17
	output : 10 is smaller between 10 and 17.         
sample input : 
	num1 : 10
	num2 : 17
	output : 17 is bigger between 10 and 17. */

package shamli;

class FindMinMaxNumber{
	
	void findMaxNumber(int num1, int num2){
		if(num1>num2){
			System.out.println(num1 +" is bigger than " +num2);
		}
		else if(num2>num1){
		System.out.println(num2 +" is bigger than " +num1);
		}	
	}
	
	void findMinNumber(int num1, int num2){
		if(num1<num2){
			System.out.println(num1 +" is smaller than " +num2);
		}
		else if(num2<num1){
			System.out.println(num2 +" is smaller than " +num1);
		}
	}
	
	public static void main(String[] args){
		FindMinMaxNumber findmaxmin=new FindMinMaxNumber();
		findmaxmin.findMaxNumber(21,15);
		findmaxmin.findMinNumber(30,19);
	}
}
	