/*
 Assignment - 11 : 7th Sep'2023

Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

 */

package nivedita;
class A11EvenNum{
	
	void printEvenNum(int startIndex, int endIndex){
		for(int num=startIndex;num<=endIndex;num++){
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
		
	public static void main(String[] args){
		A11EvenNum evenNum = new A11EvenNum();
		System.out.println("The Even Numbers are: ");	
		evenNum.printEvenNum(10,15);
		}
}
