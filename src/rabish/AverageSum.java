package rabish;
//Assignment18
class AverageSum { 

	void averageAdd(int startIndex,int endIndex){
	int count=0;
	int sum=0;

	
		for(int i =startIndex;i<=endIndex;i++){
			if(i%5==0 && i%7==0){
				  sum=sum+i;
				 count++;
				
			}
			}
			System.out.println("Sum of two numbers which is divible by 5 and 7 is " +sum);
			int avg=sum/count;
			System.out.println("Avearge of the numbers are " +avg);
		
	}
	public static void main(String[] args){
	AverageSum avgsum=new AverageSum();
	avgsum.averageAdd(1,110);
	}
}