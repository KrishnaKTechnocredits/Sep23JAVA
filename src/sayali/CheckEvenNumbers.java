// WAP to print all even numbers in a user defined range.

package sayali;

class CheckEvenNumbers{
	
	void processData(int startRange, int endRange){
		System.out.println("\n Even numbers from given range are:");
		for(int index=startRange; index<=endRange; index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		CheckEvenNumbers evenNumbers = new CheckEvenNumbers();
		evenNumbers.processData(10,15);
	}
}