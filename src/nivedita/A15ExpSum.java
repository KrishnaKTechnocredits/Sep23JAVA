/*Assignment - 15 : 7th Sep'2023		 
On user defined range print sum of all the number which is divisible by 5 & 10.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 50
Output : Expected sum is 150*/

package nivedita;
class A15ExpSum {
	
	int sum;
	
	void printSum(int startRange, int endRange){
		for(int num=startRange;num<=endRange;num++){
		    if(num%5==0 && num%10==0 ){
				sum = sum+num;	
			}
		}System.out.println(sum);
	}
	public static void main(String[] args){
		A15ExpSum expSum = new A15ExpSum();
        System.out.println("The Sum of all numbers divisible by 5 and 10 between Range 10 to 50 is: ");		
		expSum.printSum(10,50);
		}	
}