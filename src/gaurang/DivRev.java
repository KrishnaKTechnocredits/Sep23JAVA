package gaurang;

class DivRev{

	void display(int startRange, int endRange){
		for(int index = endRange; index>startRange; index--){
			if(index%7==0 || index%13==0)
				System.out.println(index + " is divisible by 7 or 13 both.");
		}
	}
	
	public static void main (String[] args){
		DivRev divRev = new DivRev();
		divRev.display(5,40);
	}
}