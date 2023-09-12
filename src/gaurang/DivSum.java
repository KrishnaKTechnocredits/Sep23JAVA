package gaurang;

class DivSum{
	
	int sum;
	int index;
	
	void display(int startRange, int endRange){
		for(index = startRange; index<=endRange; index++){
			if(index%5==0 && index%10==0)
				sum=sum+index;
		}
		System.out.println(sum + " is sum of 5 and 10 divisible by both.");
	}
	
	public static void main (String[] args){
		DivSum divSum = new DivSum();
		divSum.display(10,50);
	}

}