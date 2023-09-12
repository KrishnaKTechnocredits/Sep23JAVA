package gaurang;

class LastNum{

	void display(int startRange, int endRange){
		for(int index = endRange; index>startRange; index--){
			if(index%5==0 || index%9==0)
				if(index%5==0 && index%9==0){
					System.out.println(index + " is divisible by 7 or 13 both.");
					break;
				}
		}
	}
	
	public static void main (String[] args){
		LastNum lastNum = new LastNum();
		lastNum.display(5,100);
	}
}