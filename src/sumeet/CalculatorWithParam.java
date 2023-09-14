package sumeet;

class CalculatorWithParam{
	int addition;
	int subtraction;
	int multiplication;
	double division;

	void add(int num1, int num2){
		addition= num1 + num2;
		System.out.println("Addition =" + addition);
	}
	
	void sub(int num1, int num2){
		subtraction= num1 - num2;
		System.out.println("Subtraction =" + subtraction);
	}
	
	void multi(int num1, int num2){
		multiplication= num1*num2;
		System.out.println("Multiplication =" + multiplication);
	}
	
	void div(int num1, int num2){
		division= num1/num2;
		System.out.println("Division =" + division);
	}
	
	public static void main(String[] args){
		CalculatorWithParam cal= new CalculatorWithParam();
		cal.add(10, 5);
		cal.sub(10, 5);
		cal.multi(10, 5);
		cal.div(10, 4);		
	}
}