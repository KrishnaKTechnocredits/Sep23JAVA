package roshani;

class Example21{
		
	int processData1(int startRange, int endRange){
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
		Example21 example21 = new Example21();
		example21.processData1(1,100);
	}
}