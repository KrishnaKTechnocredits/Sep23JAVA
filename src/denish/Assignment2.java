package denish;

class CalculatorPara{
	
	int ans;
	
	void add(int num1, int num2){
		ans = num1 + num2;
		System.out.println("Addition of number = " + ans);
	}
	
	void sub(int num1, int num2){
		ans = num1 - num2;
		System.out.println("Substraction of number = " + ans);
	}
	
	void mul(int num1, int num2){
		ans = num1 * num2;
		System.out.println("Multification of number = " + ans);
	}
	
	void div(int num1, int num2){
		ans = num1 / num2;
		System.out.println("Divition of number = " + ans);
	}
	
	public static void main(String[] args){
		CalculatorPara calculator = new CalculatorPara();
		calculator.add(10,5);
		calculator.sub(10,5);
		calculator.mul(10,5);
		calculator.div(10,5);
	}
}