package roshani;

class Example21{
		
	int proccessData1(int startRange, int endRange){
		int count = 0;
		int sum=0;
		for(int num=endRange;num>=startRange;num--){
			if(num%5==0 && count<3){
				sum = sum + num;
				count++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		Example20 example20 = new Example20();
		example20.proccessData1(1,100);
	}
}