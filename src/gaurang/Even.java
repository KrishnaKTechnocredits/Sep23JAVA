package gaurang;

class Even{

	void display(int startRange, int endRange){
		for(int index = startRange; index<=endRange; index++){
			if(index%2==0)
				System.out.println("even num " + index);
		}
	}
		
	public static void main (String[] args){
		Even even = new Even();
		even.display(10,15);
	}
}