package nivedita;

class A14LastNum {
	
	void printDivisibleNum(int startRange, int endRange){
		for(int num=endRange;num>=startRange;num--){
		    if(num%5==0 && num%9==0 ){
				System.out.println(num);
				break;
			}
		}
	}
	public static void main(String[] args){
		A14LastNum lastNum = new A14LastNum();
		System.out.println("The Last Number Divisible by 5 & 9 is: ");	
		lastNum.printDivisibleNum(5,100);
		}	
}