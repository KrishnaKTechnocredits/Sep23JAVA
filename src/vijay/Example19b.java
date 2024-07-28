package vijay;

class Example19b{

	void processData(int startRange, int endRange){
		for(int num=startRange; num<=endRange; num++){
			if (num%5==0 && num%7==0){
				System.out.println(num);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		Example19b example19b = new Example19b();
		example19b.processData(1,98);
	}
}