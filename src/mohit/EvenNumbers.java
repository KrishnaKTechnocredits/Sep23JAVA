/*Assignment - 11 : 7th Sep'2023

Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14

Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14
*/

package mohit;

class EvenNumbers{
	
	void printRange(int startIndex, int endIndex){
		for(int num=startIndex;num<=endIndex;num++){
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		EvenNumbers evenNumbers= new EvenNumbers();
		System.out.println("Even numbers are : ");
		evenNumbers.printRange(10,15);
	}
}
		
