/*Assignment - 11 : 7th Sep'2023

Write only one program having the following methods.
1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14
*/
package deepak;
class Assignment11_EvenNumberCheck{
	void evenNum(int startRange, int endRange){
		System.out.println("Even Numbers in the given range:");
		for(int index = startRange ; index <= endRange ; index++){
			if(index % 2 == 0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args){
		Assignment11_EvenNumberCheck even = new Assignment11_EvenNumberCheck();
		even.evenNum(10,15);
	}
}