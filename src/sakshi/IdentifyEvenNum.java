package sakshi;

class IdentifyEvenNum {
	
	void identifyEvenNum(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if(num%2==0){
				System.out.println("Even numbers are: "+num);
			}
		}
	}
	
	public static void main(String[] args){
		IdentifyEvenNum identifyEvenNumber = new IdentifyEvenNum();
		identifyEvenNumber.identifyEvenNum(10, 15);
	}
}