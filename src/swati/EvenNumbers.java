package swati;

/*Assignment 11
 7th Sep'2023 Write only one program having the following methods. 
 1. print all even numbers in a user defined range. Hint : 
pass start and end index as a parameter. Input : Range -> 10 to 15 Output : Even numbers are: 10 12 14 */

class EvenNumbers{

	void printEvenNumbers(int StartRange,int EndRange){
		System.out.print("Even numbers are : ");
		for(int num=StartRange;num<=EndRange;num++){
			if(num%2==0){
			 System.out.print(" "+num+"");
			}
		}
	}
	
	public static void main(String[] args){
		EvenNumbers evennumbers = new EvenNumbers();
		evennumbers.printEvenNumbers(10,15);
	}
}