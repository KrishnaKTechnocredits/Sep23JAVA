package vijay;

class Example19c{

	void processData(int startRange, int endRange){
		int sum=0;
		for(int num=startRange; num<=endRange; num++){
			if (num%5==0){
				sum = num + sum;
			}
		}
		System.out.println("In the range "+startRange+"-"+endRange+" sum of all the numbers which are divisible by 5 is, "+sum );
	}
	
	public static void main(String[] args){
		Example19c example19c = new Example19c();
		example19c.processData(1,98);
	}
}

//Session-6 for_loop finished here.