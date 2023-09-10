package naresh;

class Calculatortricky{
	
	
	int sum;
	int sub;
	int multiply;
	int divide;
	int total;
	
	
	void addition(int num1, int num2){
		sum = num1+num2;
		System.out.println("the sum of given numbers is "+sum);
		}
	
		void subtraction(int num1, int num2){
			sub=num1-num2;
			System.out.println("the subtraction of given numbers is "+sub);
		}
		
		
		void multiply(int num1, int num2){
			multiply=num1*num2;
			System.out.println("the multiplication  of given number is "+multiply);
		}
	
		void division(int num1, int num2){
			divide=num1/num2;
			System.out.println("the division of given number is "+divide);
		
		}
		void display(){
		total=sum+sub+multiply+divide;
		System.out.println("total of given results is "+total);
		
		}

		
		public static void main(String[] args){
		Calculatortricky calculator=new Calculatortricky();	
		calculator.addition(10,20);
		calculator.subtraction(50,20);
		calculator.multiply(10,20);
		calculator.division(50,5);
		calculator.display();
		}
		
}