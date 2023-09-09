/*Assignment-17 : 8th Sep'2023

On user defined range print second last, third last, forth last number which is divisible by 2 & 3.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 100
Output : 90
         84		 
	     78*/
package roshani;		  

class Assignment17{
	
	void processData(int startIndex, int endIndex){
		int count = 1;
		int temp = 1;
		System.out.println("\nIn the range of " +startIndex+ " to " +endIndex+ ",\nsecond last, third last, forth last number which are divisible by 2 & 3 are: ");
		for(int num = endIndex ; num >= startIndex ; num--){
			if(num%2 == 0 && num%3 == 0){
				if(count >= 2 && count <= 4){
					System.out.println(num);
					if(temp == 3) 
						break;
					temp++;
				} 
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Assignment17 assignment17 = new Assignment17();
		assignment17.processData(10,100);
	}
}