package denish;

class Assignment7{
	
	int num1=10;
	int num2=20;
	
	void smaller(int num1, int num2){
		
		if(num1 < num2){
			System.out.println("10 is smaller between 10 and 20");	
		}
		
	}
	
	void bigger(int num1, int num2){
		
		if(num1 < num2){
			System.out.println("20 is bigger between 10 and 20");
		}
	}
	
	public static void main(String[] args){
		Assignment7 assignment7 = new Assignment7();
		assignment7.smaller(10,20);
		assignment7.bigger(10,20);
	}
}