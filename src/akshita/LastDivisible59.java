package akshita;

class LastDivisible59{
	void evenNumber(int startIndex, int endIndex){
		int index ;
		for(index = endIndex ; index>=startIndex ;index--){
			if(index%5 ==0 && index%9 ==0){
				{
					System.out.println("Number which is divisible by 5 & 9 is " + index);
					break;
				}
			}
		}	
    }	
	public static void main(String[] args){
		LastDivisible59 lastDivisible59 = new LastDivisible59();
		lastDivisible59.evenNumber(5,100);
	}
}