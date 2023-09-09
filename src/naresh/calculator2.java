package naresh;

class Calculator2{

	void addition(int num1, int num2){
	int ans=num1+num2;
	System.out.println("the sum of given numbers is "+ans);
	}
	
		void subtraction(int num1, int num2){
	int ans=num1-num2;
	System.out.println("the subtraction of given numbers is "+ans);
		}
		
		void multiply(int num1, int num2){
	int ans=num1*num2;
		System.out.println("the multiplication  of given number is "+ans);
		}
	
		void division(int num1, int num2){
		int ans=num1/num2;
	System.out.println("the division of given number is "+ans);
		
		}	
		public static void main(String[] args){
		Calculator2 calculator=new Calculator2();	
		calculator.addition(10,20);
		calculator.subtraction(50,20);
		calculator.multiply(10,20);
		calculator.division(50,5);
		}
		
		
		
		
		
		



}