package akash;

class ReverseDivision{
	
	void findReverseDivision(int startIndex, int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for(int num=endIndex;num>=startIndex;num--){
			if(num%7==0){
				System.out.println(num+" number is divisible by 7");
			}else if (num%13==0){
				System.out.println(num+" number is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args){
		ReverseDivision reversedivision = new ReverseDivision();
		reversedivision.findReverseDivision(5,40);
	}
}