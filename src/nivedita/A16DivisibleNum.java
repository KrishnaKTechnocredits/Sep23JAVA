package nivedita;

/* Assignment - 16 : 7th Sep'2023		 
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
         36 
*/

class A16DivisibleNum{
	
	int count;
	void printNum(int startRange, int endRange){
		for(int num=startRange;num<=endRange;num++){
		    if(num%3==0 && num%4==0 ){
				System.out.println(num);
				count = count+1;
				if (count==3){
					break;
				}
			}
		}
	}
	public static void main(String[] args){
		A16DivisibleNum divisibleNum = new A16DivisibleNum();
        System.out.println("The First Three Numbers Divisible by 3 and 4 are: ");		
		divisibleNum.printNum(10,500);
	}	

}