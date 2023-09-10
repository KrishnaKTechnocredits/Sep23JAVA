package aditya;
class Assignment17{
	
	void display(int StartRange, int EndRange){
		int count=1;
		for(int no=EndRange; no>=StartRange; no--){
			if(no%2==0 && no%3==0){
				if(count>=2 && count<=4){
					System.out.println("Numbers are :- " +no);
					
				}
					count++;
			}
			
		}
	}
	
	public static void main(String[] args){
		Assignment17 as17 = new Assignment17();
		as17.display(10,100);
	}
	
}