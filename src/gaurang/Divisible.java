package gaurang;

class Divisible{
	
	void display(int startRange, int endRange){
		for(int index = startRange; index<=endRange; index++){
			if(index%5==0 && index%3==0)
				System.out.println(index + " is divisible by 3 and 5 both.");
		}
	}
	
	public static void main (String[] args){
		Divisible divisible = new Divisible();
		divisible.display(5,40);
	}

}