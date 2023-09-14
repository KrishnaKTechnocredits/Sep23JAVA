package mohit;


class EvenNumbers{
	
	void printRange(int startIndex, int endIndex){
		for(int num=startIndex;num<=endIndex;num++){
			if(num%2==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		EvenNumbers evenNumbers= new EvenNumbers();
		System.out.println("Even numbers are : ");
		evenNumbers.printRange(10,15);
	}
}
		
