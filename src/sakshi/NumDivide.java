package sakshi;

class NumDivide {
	
	void numDivide(int startRange, int endRange){
		int count=0;
		System.out.println("First 3 number divisible by 3 and 4 is :");
			for(int num=startRange; num<=endRange; num++){
				if(num%3==0 && num%4==0){
					System.out.println(num);
					count++;
					if(count>=3){
						break;
					}
				}
			}
	}
	
	public static void main(String[] args){
		NumDivide numDiv = new NumDivide();
		numDiv.numDivide(10, 500);
	}
			
}