package sakshi;

class DivideNumber {
	
	void divideNumber(int startRange, int endRange){
		int sum=0;
		for(int num=startRange; num<=endRange; num++){
			if(num%5==0 && num%10==0){
				sum = sum+num;
			}
		}
		System.out.println("Expected sum is "+sum);
	}
	
	public static void main(String[] args){
		DivideNumber divNum = new DivideNumber();
		divNum.divideNumber(10, 50);
	}
}