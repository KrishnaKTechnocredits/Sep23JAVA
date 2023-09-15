package mohit;


class PrintAllNumbers{

	void processData(int startIndex, int endIndex){
		for(int num=startIndex;num<=endIndex;num++){
			if(num%5==0 && num%3==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		PrintAllNumbers printAllNumbers = new PrintAllNumbers();
		System.out.println("Divisible by 5 & 3, numbers are : ");
		printAllNumbers.processData(5, 40);
	}
}
				