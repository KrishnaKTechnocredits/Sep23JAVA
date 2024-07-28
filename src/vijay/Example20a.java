package vijay;

class Example20a{

	void printNumDivByFive(int startRange, int endRange){
		int count=1;
		for (int num=startRange; num<=endRange; num++){
			if(num%5==0){
				if(count==7){
					System.out.println(num);
					break;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20a example20a = new Example20a();
		example20a.printNumDivByFive(1,100);
	}
}

// Q 20a : print 7th num divisible by 5.