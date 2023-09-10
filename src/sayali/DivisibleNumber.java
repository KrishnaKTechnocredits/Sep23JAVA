/* WAP On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
         84		 
	     78  
*/

package sayali;
		 
class DivisibleNumber{
	
	void processData(int startRange, int endRange){
		
		int count=0;
		
		System.out.println("\nNumbers divisible by 2 & 3 are: ");
		
		for(int num=endRange; num>=startRange; num--){
			if(num%2==0 && num%3==0){
				count++;
				if(count>=2 && count<=4){
					System.out.println(num);
					if(count==4)
						break;
				}
			}
		}
	}
	
	public static void main(String[] args){
		DivisibleNumber divisibleNumber = new DivisibleNumber();
		divisibleNumber.processData(10,100);
	}
}		 