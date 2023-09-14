package akash;

class Sum{
	
	void findSum(int startIndex, int endIndex){
		int sum=0;
		for(int num=startIndex;num<=endIndex;num++){
			if(num%5==0 && num%10==0){
				sum=sum+num;
			}
		}
		System.out.println("Expected sum is : "+sum);
	}
	
	public static void main(String[] args){
		Sum sum = new Sum();
		sum.findSum(10,50);
	}
}