package denish;

class Assignment15{
	
	void sum(int startIndex, int endIndex){
		int sum = 0;
		for(int index = startIndex ; index <= endIndex ; index++){
			if(index % 5==0 && index % 10==0){
				sum = sum + index;
			}
		}
		System.out.println("Sum of number is division by 5 and 10 in the givin range is "+sum);
	}
	
	public static void main(String[] args){
		Assignment15 assignment15 = new Assignment15();
		assignment15.sum(10,50);
	}
}