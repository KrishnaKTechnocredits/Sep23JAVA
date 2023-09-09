package swati;

/* Assignment 15 
 7th Sep'2023 On user defined range print sum of all the number which is divisible by 5 & 10. 
 Hint : pass start and end index as a parameter. Input : Range -> 10 to 50 Output : Expected sum is 150 */
 
class DivisibleNumberSum{
	
	void sumofDivisibleNumber(int StartRange,int EndRange){
		
		int sum=0;
		
		for(int number=StartRange;number<=EndRange;number++){
			if(number%5==0 && number%10==0){
				sum=sum+number;
			}
		}
		System.out.println("Sum of numbers divisible by 5 and 10 is "+sum);
	}
	
	public static void main(String[] args){
		DivisibleNumberSum divisiblenumbersum = new DivisibleNumberSum();
		divisiblenumbersum.sumofDivisibleNumber(10,50);
	}
}