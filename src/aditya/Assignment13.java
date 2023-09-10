package aditya;
class Assignment13{
	
	void Display_No(int StartRange, int EndRange){
		for(int num=EndRange; num>=StartRange; num--){
			if(num%7==0){
				System.out.println("Numbers divisble by 7 :- " +num);
			}else if(num%13==0){
				System.out.println("Numbers divisble by 13:- " +num);
			}
		}
	}
	
	public static void main(String[] args){
		Assignment13 as13= new Assignment13();
		as13.Display_No(5,40);
	}
	
}