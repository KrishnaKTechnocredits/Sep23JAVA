package aditya;
class Assignment18{
	
	void display(int StartRange, int EndRange){
		int sum=0;
		int avg=0;
		int temp=0;
		int count=0;
		for(int no=StartRange; no<=EndRange; no++){
			if(no%5==0 && no%7==0){
				count++;
				sum=sum+no;
							
			}
		}
		
		avg=sum/count;
		System.out.println("Sum is :- " +sum +  "  Average is :- " +avg);
	}
	
	
	public static void main(String[] args){
		Assignment18 as18 = new Assignment18();
		as18.display(1,110);
	}

}