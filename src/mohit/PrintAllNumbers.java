/*1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
		 15
		 30
*/
package mohit;


class PrintAllNumbers{

	void processData(int startIndex, int endIndex){
		for(int num=startIndex;num<=endIndex;num++){
			if(num%5==0 && num%3==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		PrintAllNumbers printAllNumbers = new PrintAllNumbers();
		System.out.println("Divisible by 5 & 3, numbers are : ");
		printAllNumbers.processData(5, 40);
	}
}
				