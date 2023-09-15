package gaurang;

class CalculatorTricky{
	
	int totalAns;
	
	void add(int num1,int num2){
		int total = num1 +num2;
		System.out.println("Addition of "+num1+" and "+num2+" is " + total);
		totalAns = totalAns + total;
	}
	
	void sub(int num1,int num2){
		int total = num1 - num2;
		System.out.println("Subtraction of "+num1+" and "+num2+" is "+total);
		totalAns = totalAns + total;
	}
	
	void mul(int num1,int num2){
		int total = num1 * num2;
		System.out.println("Multiplication of "+num1+" and "+num2+" is "+total);
		totalAns = totalAns + total;
	}
	
	void div(int num1,int num2){
		int total = num1 / num2;
		System.out.println("Division of "+num1+" and "+num2+" is "+total);
		totalAns = totalAns + total;
	}
	
	public static void main(String[] args){
		CalculatorTricky calculatorTricky = new CalculatorTricky();
		calculatorTricky.add(10,5);
		calculatorTricky.sub(10,5);
		calculatorTricky.mul(10,5);
		calculatorTricky.div(10,5);
		System.out.println("Total after all operations is " + calculatorTricky.totalAns);
	}
}