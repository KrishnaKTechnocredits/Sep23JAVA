// On user defined range print sum of all the number which is divisible by 5 & 10
/* Input : Range -> 10 to 50
Output : Expected sum is 150*/

package onkar;

class Assignment15{
	
	void printSum(int startIndex, int endIndex){
		int sum = 0;
		for(int num=startIndex; num<=endIndex; num++){
			if(num%5==0 && num%10==0)
				sum = sum + num;
		}
		System.out.print("Expected sum is "+sum);
	}
	
	public static void main(String[] args){
		Assignment15 assignment15 = new Assignment15();
		assignment15.printSum(10,50);
	}
}