// On user defined range print last number which is divisible by 5 & 9
/*Input : Range -> 5 to 100
Output : Last number divisible by 5 & 9 is 90*/

package onkar;

class Assignment14{
	
	void findNumber(int startIndex, int endIndex){
		int lastNumber = 0;
		for(int num=startIndex; num<=endIndex; num++){
			if (num%5==0 && num%9==0){
				lastNumber=num;
			}
		}
		System.out.println("Last number divisible by 5 & 9 is "+lastNumber);
	}
	
	public static void main(String[] args){
		Assignment14 assignment14 = new Assignment14();
		assignment14.findNumber(5,100);
	}
}