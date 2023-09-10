package aditya;
class Assignment12{
	
	void Divisible_by(int StartRange, int EndRange){
		for(int no=StartRange; no<=EndRange; no++){
			if(no%5==0 && no%3==0){
				System.out.println(" Numbers which are divisble by 3 and 5 : - "+no);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment12 as12 = new Assignment12();
		as12.Divisible_by(5,40);
	}

}