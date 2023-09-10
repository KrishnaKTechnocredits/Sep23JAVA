//program for parameters and addition of their answer
package yogesh;
class CalculatorPadd{
	int ans;
	int total;
	void add(int a,int b){
		ans=a+b;
		System.out.println("Summation is " +ans);
		total=total+ans;
	}
	
	void substraction(int a,int b){
		ans=a-b;
		System.out.println("Substraction  is "+ans);
		total=total+ans;
	}
	
	void multiplication(int a,int b){
		ans=a*b;
		System.out.println("Multiplication  is " +ans);
		total=total+ans;
	}
	
	void division(int a,int b){
		ans=a/b;
		System.out.println("Division is " +ans);
		total=total+ans;
		System.out.println("Total Sum of all answers is "+total);
	}
	public static void main(String[] args){
		CalculatorPadd calculator=new CalculatorPadd();
		calculator.add(5,10);
		calculator.substraction(10,5);
		calculator.multiplication(10,5);
		calculator.division(10,5);
	}
}