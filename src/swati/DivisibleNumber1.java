package swati;

/* Assignment 14 
 7th Sep'2023 On user defined range print last number which is divisible by 5 & 9. 
 Hint : pass start and end index as a parameter. Input : Range -> 5 to 100 Output : Last number divisible by 5 & 9 is 90 */
 
class DivisibleNumber1{
	
	void divisibleNumb(int StartRange,int EndRange){
		
		for(int number=EndRange;number>=StartRange;number--){
			if(number%5==0 && number%9==0){
				System.out.println("Last number divisible by 5 & 9 is "+number);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleNumber1 divisiblenumber1 = new DivisibleNumber1();
		divisiblenumber1.divisibleNumb(5,100);
	}
}
