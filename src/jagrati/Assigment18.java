package jagrati;



/////On user defined range print sum and average of numbers which is divisible by 5 & 7.
//Hint : pass start and end index as a parameter.

class Assigment18{
        
     void sumAndAvg(int passStart, int endIndex){
		 int count=0;
		 int sum=0;
		
		for(int num = passStart; num<=endIndex; num++)
			if(num%5==0 && num%7==0)
			{
				System.out.print(num);
				sum = sum + count;
				count++;
			}
		
	 } 
	public static void main(String [] args){
		Assigment18 avg = new Assigment18();
		avg.sumAndAvg(1,110);
	}
}