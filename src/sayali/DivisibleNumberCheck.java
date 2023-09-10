// WAP On user defined range, print all numbers which are divisible by 7 or 13 in reverse order.

package sayali;

class DivisibleNumberCheck{
	
	void processData(int startRange, int endRange){
		for(int index=endRange; index>=startRange; index--){
			if(index%7==0){
				System.out.println(index+ " is divisible by 7");
			}
			else if(index%13==0)
				System.out.println(index+ " is divisible by 13");
		}
	}
	
	public static void main(String[] args){
		DivisibleNumberCheck divisibleNumber = new DivisibleNumberCheck();
		divisibleNumber.processData(5,40);
	}
}