package akash;

class LastNumber{
	
	void findLastNumber(int startIndex, int endIndex){
		for(int num=endIndex;num>=startIndex;num--){
			if(num%5==0 && num%9==0){
				System.out.println( "Last number divisible by 5 & 9 is - "+num);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		LastNumber lastnumber = new LastNumber();
		lastnumber.findLastNumber(5,100);
	}
}
