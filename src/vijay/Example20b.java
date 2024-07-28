package vijay;

class Example20b{

	void printNumDivByFive(int startRange, int endRange){
		int count=1;
		for (int num=endRange; num>=startRange; num--){
			if(num%5==0){
				if(count==3){
					System.out.println(num);
					break;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20b example20b = new Example20b();
		example20b.printNumDivByFive(1,100);
	}
}

// Q 20b : print last 3rd num divisible by 5.