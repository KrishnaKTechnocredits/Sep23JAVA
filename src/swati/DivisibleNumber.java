package swati;

/*Assignment 12
7th Sep'2023 1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
 Hint : pass start and end index as a parameter. Input : Range -> 5 to 40 Output : Divisible by 5 & 3, numbers are: 15 30 */
 
class DivisibleNumber{
	
	void divisibleNumb(int StartRange,int EndRange){
		
		System.out.print("Numbers divisible by 5 and 3 are ");
		
		for(int number=StartRange;number<=EndRange;number++){
			if(number%5==0 && number%3==0){
				System.out.print(" "+number+" ");
			} 
		}
	}
	
	public static void main(String[] args){
		DivisibleNumber divisiblenumber = new DivisibleNumber();
		divisiblenumber.divisibleNumb(5,40);
	}
}

