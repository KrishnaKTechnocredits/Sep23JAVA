/*Assignment - 15 : 7th Sep'2023		 
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150*/
package jyoti;
class DivSum{

	void processData(int startRange, int endRange){
		int sum=0;
		
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0 && num%10==0){
				sum = sum + num;
				//System.out.println("In loop num: " +num+"  Sum: "+sum);
			}
		}
		System.out.println("In the range" + startRange + "-" + endRange + ", Sum of all the numbers which are div by 5 is, " + sum);
	}
		public static void main(String[] args){
		DivSum dsm= new DivSum();
		dsm.processData(10,50);
		}
}	


//num=10;num<=50;
//10%5=0 10%10=0
//Sum=0+10=10


