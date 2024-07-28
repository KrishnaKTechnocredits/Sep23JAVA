package vijay;

class Example19{

	void processData(int startRange, int endRange){
		for(int num=endRange; num>=startRange; num--){
			if (num%5==0){
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args){
		Example19 example19 = new Example19();
		example19.processData(1,98);
	}
}

// To print all the numbers see above Example19.