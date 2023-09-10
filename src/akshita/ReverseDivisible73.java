package akshita;

class ReverseDivisible73{
	void evenNumber(int startIndex, int endIndex){
		int index ;
		for(index = endIndex ; index>=startIndex ;index--){
			if(index%7 ==0 || index%13 ==0){
				if(index%7 ==0){
					System.out.println(index + "is divisible by 7" );
				}
				else{
					System.out.println(index + "is divisible by 13" );
				}
			}
		}
		if(startIndex>endIndex){
			System.out.println("Invalid");
	    }	
    }	
	public static void main(String[] args){
		ReverseDivisible73 reversedivisible73 = new ReverseDivisible73();
		reversedivisible73.evenNumber(5,40);
		reversedivisible73.evenNumber(50,40);	
	}
}