package mohit;


class Example20{

	void printNumDivByFive(int startRange, int endRange){
		int count = 1;
		for(int num=startRange;num<=endRange;num++){
			if(num%5==0){
				System.out.println(num);
				if(count==5){
					break;
				}
				count++;
			}
		}
	}
	
	public static void main(String[] args){
		Example20 example20 = new Example20();
		example20.printNumDivByFive(1, 50);
	}
}