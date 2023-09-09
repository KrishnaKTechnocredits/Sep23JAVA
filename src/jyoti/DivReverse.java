/*Assignment - 13 : 7th Sep'2023		 
On user defined range print all numbers which are divisible by 7 or 13 in reverse order.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 39 is divisible by 13
		 35 is divisible by 7
		 28 is divisible by 7
		 26 is divisible by 13
		 21 is divisible by 7
		 14 is divisible by 7
		 13 is divisible by 13
		 7 is divisible by 7*/

package jyoti;
class DivReverse{
	
		void processData(int startRange, int endRange){
		for(int num=endRange;num>=startRange;num--){
			if(num%7==0){
				System.out.println(num + " is divisible by 7"  );
				}else if( num%13==0){
				System.out.println(num + " is divisible by 13"  );
				}
			}
		}
		public static void main(String[] args){
		DivReverse drev = new DivReverse();
		drev.processData(5,40);
		}
		
}