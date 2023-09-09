package akshita;

class CountDivisible510{
	void evenNumber(int startIndex, int endIndex){
		int index ;
		int sum=0;
		for(index = endIndex ; index>=startIndex ;index--){
			if(index%5 ==0 && index%10 ==0){
				{
					System.out.println("Number which is divisible by 5 & 9 is " + index);
					sum = sum + index;
				}
			}
		}
		System.out.println("Sum of Number which is divisible by 5 & 9 is " + sum);
    }	
	public static void main(String[] args){
		CountDivisible510 countDivisible510 = new CountDivisible510();
		countDivisible510.evenNumber(10,50);
	}
}