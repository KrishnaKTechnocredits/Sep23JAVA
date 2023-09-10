// On user defined range, print all numbers which are divisible by 5 and divisible by 3.

package sayali;

class IsNumberDivisible{
	void processData(int startRange, int endRange){
		System.out.println("\nNumbers which are divisible by 5 & 3 are:");
		for(int index=startRange; index<=endRange; index++){
			if(index%5==0 && index%3==0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		IsNumberDivisible divisibleNumbers = new IsNumberDivisible();
		divisibleNumbers.processData(5,40);
	}
}