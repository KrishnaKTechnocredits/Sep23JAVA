package mayank;


class Assignment18{
	
	void Numbers(int startIndex,int endIndex){
		
		int count = 0;
		int sum = 0;
		int avg = 0;
		
		for(int num=startIndex;num<=endIndex;num++){
			if(num%5==0 && num%7==0){
				System.out.println(num);
				sum = sum + num;
				count++;
				}				
		}		
			System.out.println(" Found "  + count +" numbers which are divisible by 5 & 7");
			System.out.println("sum is " + sum);
			avg=sum/count;
			System.out.println("Average is " + avg);
	}
		
	public static void main(String[] args){
		Assignment18 assignment18 = new Assignment18();
		assignment18.Numbers(1,110);
	}
}