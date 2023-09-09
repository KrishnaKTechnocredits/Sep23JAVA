//Assignment - 2 :
//
//Write a program called CalculatorWithParam, all 4 methods should be parameterized.
//hint : 
//void add(int num1, int num2){
//
//}
package harshada;
class CalculatorWithParam{

	void add(int num1,int num2){
		int answer=num1+num2;
		System.out.println("Addition is "+ answer);
	}
	
	void sub(int num1,int num2){
		int answer=num1-num2;
		System.out.println("Substraction is "+ answer);
	}
	
	void div(int num1,int num2){
		int answer=num1/num2;
		System.out.println("Division is "+ answer);
	}
	
	void mul(int num1,int num2){
		int answer=num1*num2;
		System.out.println("Multiplication is "+ answer);
	}

	public static void main(String[]args){
		CalculatorWithParam calculator=new CalculatorWithParam();
		calculator.add(10,5);
		calculator.sub(15,10);
		calculator.div(100,2);
		calculator.mul(11,22);
	}
}
