/*Assignment-18 : 8th Sep'2023

On user defined range print sum and average of numbers which is divisible by 5 & 7.
Hint : pass start and end index as a parameter.
Input : Range -> 1 to 110
Output : Numbers are,
                35
		 70
                105
		 Found 3 numbers which are divible by 5 & 7.
		 sum = 210
		 Avearge = 70*/
package jyoti;		 
class Div5n7SumAvg{
	int sum=0;
	int avg=0;

	void printSumAvg(int startRange, int endRange){
		
		int count=0;
		int temp=0;
		int numb=0;
		System.out.println("3 numbers which are divible by 5 & 7");
		System.out.println("============================================");
		for(int num=startRange ; num<=endRange ; num++){
			if(num%5==0 && num%7==0 && count!=3){
				count++;
				System.out.println("num =" +num);
				if(temp!=3){
					temp++;
					sum=sum+num;
				}
					avg=sum/count;
			}
		}
		System.out.println("On user defined range the sum of numbers is " + sum+ " and its average is " +avg+" which is divisible by 5 & 7");
	}	
	
	public static void main(String[] args){
		Div5n7SumAvg div =new Div5n7SumAvg();
		div.printSumAvg(1,110);
	}
}		 
		 
		 