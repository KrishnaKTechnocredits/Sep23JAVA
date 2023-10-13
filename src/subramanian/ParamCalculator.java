package subramanian;
class ParamCalculator{

	void add(int num1,int num2){
		int ans=num1+num2;
		System.out.println("Addition of given number "+ans);
	}
	void sub(int num1,int num2){
		int ans=num1-num2;
		System.out.println("Subtraction is "+ans);
	}
	void div(int num1,int num2){
		int ans=num1/num2;
		System.out.println("Division is "+ans);
	}
	void mul(int num1,int num2){
		int ans=num1*num2;
		System.out.println("Multiplication is "+ans);
	}
	public static void main(String[] args){
		 ParamCalculator calculator =new ParamCalculator();
		 calculator.add(15,10);
		 calculator.sub(20,10);
		 calculator.mul(10,5);
		 calculator.div(10,2);
}
}