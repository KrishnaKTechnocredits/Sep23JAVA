package naresh;
/*Assignment - 12 : 7th Sep'2023

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
		 15
		 30*/

class Practise2{
	void userDefined (int passStart,int endIndex){
		for(int num =passStart;num<=endIndex;num++){
			if(num%5==0|| num%3==0){
			System.out.println(num);
			}
		}
	}
	public static void main(String[] args){
		Practise2 practise = new Practise2();
        practise.userDefined(5,40);		
		
		
	}
}



