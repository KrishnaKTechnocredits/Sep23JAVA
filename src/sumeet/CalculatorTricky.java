package sumeet;

class CalculatorTricky{
	int total=0;
	
	void addition(int num1, int num2){
		int add= num1 + num2;
		total= total+add;
		System.out.println("Addition =" + add);
	}
	
	void subtraction(int num1, int num2){
		int sub= num1 - num2;
		total= total+sub;
		System.out.println("Subtraction =" + sub);
	}
	
	void multiplication(int num1, int num2){
		int multi= num1 * num2;
		total= total+multi;
		System.out.println("Multiplication =" + multi);
	}
	
	void division(int num1, int num2){
		int div= num1/num2;
		total= total+ div;
		System.out.println("Division =" + div);
	}
	
	void totalSum(){
		System.out.println("Total sum is =" + total);
	}
	
	public static void main(String[] args){
		CalculatorTricky cal= new CalculatorTricky();
		cal.addition(10, 5);
		cal.subtraction(20, 10);
		cal.multiplication(5, 7);
		cal.division(20, 4);
		cal.totalSum();
	}
}