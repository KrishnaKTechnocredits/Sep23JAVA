package gaurang;

class DivBy3{
	
	int count;
	
	void display(int startRange, int endRange){
		for(int index = startRange; index<=endRange; index++){
			if(index%4==0 && index%3==0){	
				System.out.println(index + " is divisible by 3 and 4 both.");
				count=count+1;
				if(count==3)
					break;
			}
		}
	}
	
	public static void main (String[] args){
		DivBy3 divBy3 = new DivBy3();
		divBy3.display(5,40);
	}
}