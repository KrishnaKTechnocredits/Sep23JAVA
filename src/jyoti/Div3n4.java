/*Assignment - 16 : 7th Sep'2023		 
On user defined range print first 3 numbers which is divisible by 3 & 4.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
         12
         24
         36	*/
package jyoti;
class Div3n4{
	void printDiv3n4(int startRange, int endRange){
		int count=0;
		System.out.println(" First 3 numbers divisible by 3 and 4 is :");
		System.out.println("==========================================");
		for(int num=startRange;num<=endRange;num++){
			if(num%3==0 && num%4==0){
				count=count+1;
				if(count<=3){
					System.out.println(num);
				
				}
			
			}
		}
	
	}
	public static void main(String[] args){
		Div3n4 div = new Div3n4();
		div.printDiv3n4(10,500);
	}

}

		 