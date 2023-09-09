/*Assignment - 12 : 7th Sep'2023

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
		 15
		 30*/
package jyoti;
class Divisible{
		
		void processData(int startRange, int endRange){
		for(int num=startRange;num<=endRange;num++){
			if(num%3==0 && num%5==0){
				System.out.println(num);
				}
			}
		}

		public static void main(String[] args){
			Divisible div= new Divisible();
			div.processData(5,40);
		
		}
}