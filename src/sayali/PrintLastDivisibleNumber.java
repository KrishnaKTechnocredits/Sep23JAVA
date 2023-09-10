// WAP on user defined range & print last number which is divisible by 5 & 9.

package sayali;

class PrintLastDivisibleNumber{
	
	void processData(int startRange, int endRange){
		for(int num=endRange; num>=startRange; num--){
			if(num%5==0 && num%9==0){
				System.out.println("\nLast number divisible by 5 & 9 is "+num);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		PrintLastDivisibleNumber lastDivisibleNumber = new PrintLastDivisibleNumber();
		lastDivisibleNumber.processData(5,100);
	}
}