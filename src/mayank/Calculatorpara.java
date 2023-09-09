package mayank;


class Calculatorpara{
	int total;
	void add(int num1,int num2){
		int total=num1+num2;
		System.out.println("Addition is ="+total);
	}
	
	void sub(int num1,int num2){
		int total=num1-num2;
		System.out.println("Subtraction is ="+total);
	}
	
	void mul(int num1,int num2){
		int total=num1*num2;
		System.out.println("Multiplication  is ="+total);
	}
	
	void div(int num1,int num2){
		int total=num1/num2;
		System.out.println("division is ="+total);
	}
	
	public static void main(String[] args){
		Calculatorpara calculator = new Calculatorpara();
		calculator.add(30,30);
		calculator.sub(10,10);
		calculator.mul(50,60);
		calculator.div(500,100);
	}
}