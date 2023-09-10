// On user defined range print all numbers which are divisible by 7 or 13 in reverse order.
/*Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 39 is divisible by 13
		 35 is divisible by 7
		 28 is divisible by 7
		 26 is divisible by 13
		 21 is divisible by 7
		 14 is divisible by 7
		 13 is divisible by 13
		 7 is divisible by 7*/

package onkar;

class Assignment13{

	void printNumbers(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int num=endIndex; num>=startIndex; num--){
			if (num%13==0)
				System.out.println(num+" is divisible by 13");
			if (num%7==0)
				System.out.println(num+" is divisible by 7");
		}
	}
	
	public static void main(String[] args){
		Assignment13 assignment13 = new Assignment13();
		assignment13.printNumbers(5,40);
	}
}