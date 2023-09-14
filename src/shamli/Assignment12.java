/*
 * Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	
 */
package shamli;

public class Assignment12 {
	
	void printEvenNumbersInRange(int startRange,int endRange) {
		for(int num=startRange; num<=endRange;num++) {
			if(num%2==0) {
				System.out.println(num+" is a even number");
			}
		}
	}

	public static void main(String[] args) {
		Assignment12 assignment12= new Assignment12();
		assignment12.printEvenNumbersInRange(10, 20);
	}
}
