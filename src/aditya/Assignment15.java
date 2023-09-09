package aditya;
class Assignment15{

	void Sum_Of(int StartRange, int EndRange){
		int sum=0;
		int no=0;
		for(no=StartRange; no<=EndRange; no++){
			if(no%5==0 && no%10==0){
				sum=sum+no;
			}
		}
		System.out.println("sum of numbers is " +sum);
	}
	
	public static void main(String[] args){
		Assignment15 as15= new Assignment15();
		as15.Sum_Of(10,50);
	}	
}