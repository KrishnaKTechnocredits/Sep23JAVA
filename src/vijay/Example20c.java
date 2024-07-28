package vijay;

class Example20c{

	void printNumDivByFive(int startRange, int endRange, int nthLast){
		int count=1;
		for (int num=endRange; num>=startRange; num--){
			if(num%5==0){
				if(count==nthLast){
					System.out.println(num);
					break;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20c example20c = new Example20c();
		example20c.printNumDivByFive(1,100,5);
	}
}

// Q 20c : print last nth num divisible by 5.