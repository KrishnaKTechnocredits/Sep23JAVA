package akshita;

class CountDivisible59{
	void evenNumber(int startIndex, int endIndex){
		int count,index ;
		for(index = startIndex ; index>=endIndex ;index++){
			if(index%5 ==0 && index%10 ==0){
				{
					System.out.println("Number which is divisible by 5 & 10 is " + index);
					
				}
			}
		}	
    }	
	public static void main(String[] args){
		CountDivisible59 countDivisible59 = new CountDivisible59();
		countDivisible59.evenNumber(5,100);
	}
}