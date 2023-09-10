package naresh;

/*Assignment - 15 : 7th Sep'2023		 
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150*/


class Practise5{
	int count;

	void userDefined(int num1 ,int num2){
	for(int i = num2;i>=num1;i--){
		if(i%5==0 && i%10==0){
			{
        System.out.println("Expected sum is"+i);
		count= count+i;
		}	
	}
		}
		System.out.println("sum of numbers which is divisible by 5 and 9 is"+count);
}		
		public static void main(String[] args){
			
			Practise5 practise = new Practise5();
			practise.userDefined(10,50);
			
			
		}
	
	}  
	