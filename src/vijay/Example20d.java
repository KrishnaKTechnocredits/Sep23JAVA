package vijay;

class Example20d{

	void printNumDivByFive(int startRange, int endRange){
		int count=1;
		for (int num=endRange; num>=startRange; num--){
			if(num%5==0){
				if(count==2){
					System.out.println(num);
					System.out.println(num-1);
					System.out.println(num-2);										
					break;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20d example20d = new Example20d();
		example20d.printNumDivByFive(1,100);
	}
}

// Q 20d : print last 2nd num divisible by 5 and also print 94 and 93.