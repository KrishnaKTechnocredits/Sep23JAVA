package swati;

/* Assignment-17 : 
8th Sep'2023 On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
 Hint : pass start and end index as a parameter. Input : Range -> 10 to 100 Output : 90  84  78*/
 
class DivisibleNumber3{
	
	void divisibleNumb(int StartRange,int EndRange){
		
		int count=0;
		
		System.out.print("Numbers divisible by 2 and 3 are ");

		for(int number=EndRange;number>=StartRange;number--){
			if(number%2==0 && number%3==0){
				count++;
				if(count>=2 && count<=4){
					System.out.print(" "+number+" ");
					if(count==4)
						break;
				} 	
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleNumber3 divisiblenumber3 = new DivisibleNumber3();
		divisiblenumber3.divisibleNumb(10,100);
	}
}