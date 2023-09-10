package swati;

/* Assignment 16 
 Assignment - 16 : 7th Sep'2023 On user defined range print first 3 numbers which is divisible by 3 & 4.
 Hint : pass start and end index as a parameter. Input : Range -> 10 to 500 Output : First 3 numbers divisible by 3 and 4 is :
 12         
 24         
 36 */
 
class DivisibleNumber2{

	void divisibleNumb(int StartRange,int EndRange){
		
		int count=0;
		
		System.out.println("First 3 numbers divisible by 3 and 4 are : ");
		
		for(int number=StartRange;number<=EndRange;number++){
			if(number%3==0 && number%4==0){
				System.out.println(" "+number+" ");
				count=count+1;
				if(count==3){
					break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleNumber2 divisiblenumber2 = new DivisibleNumber2();
		divisiblenumber2.divisibleNumb(10,500);
	}
}