package subramanian;
class ParamCalculator2{
	int total;
	void add(int num1,int num2){
		int ans=num1+num2;
		System.out.println("Addition of given number "+ans);
		total=total+ans;
	}
	
	void sub(int num1,int num2){
		int ans=num1-num2;
		System.out.println("Subtraction is "+ans);
		total=total+ans;
	}
	
	void div(int num1,int num2){
		int ans=num1/num2;
		System.out.println("Division is "+ans);
		total=total+ans;
	}
	
	void mul(int num1,int num2){
		int ans=num1*num2;
		System.out.println("Multiplication is "+ans);
		total=total+ans;	
	}
	
	void total(){
	System.out.println("Total of all values "+total);
	}
	
	public static void main(String[] args)
	{
		 ParamCalculator2 calculator =new ParamCalculator2();
		 calculator.add(15,10);
		 calculator.sub(20,10);
		 calculator.mul(10,5);
		 calculator.div(10,2);
		 calculator.total();
}
}