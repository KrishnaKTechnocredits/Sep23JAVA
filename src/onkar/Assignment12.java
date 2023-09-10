//On user defined range print all numbers which are divisible by 5 and divisible by 3
/*Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
		 15
		 30*/

package onkar;

class Assignment12{
	
	void printNumbers(int startIndex, int endIndex){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int num=startIndex; num<=endIndex; num++){
			if (num%5==0 && num%3==0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		Assignment12 assignment12 = new Assignment12();
		assignment12.printNumbers(5,40);
	}
}