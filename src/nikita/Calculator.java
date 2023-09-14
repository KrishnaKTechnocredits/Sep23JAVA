package nikita;

class Calculator{
	int numb1=10;
	int numb2=2;
	
	void add(){
		int ans= numb1+numb2;
		System.out.println("Addition of number is =" +ans);
	}
	
	void substract(){
		int ans=numb1-numb2;
		System.out.println("Substraction of number is =" +ans);
	}
	
	void multiply(){
		int ans= numb1*numb2;
		System.out.println("Multiplication of number is =" +ans);
	}
	
	void devide(){
		int ans= numb1/numb2;
		System.out.println("Division of number is =" +ans);
	}
		
	public static void main(String[] args){
		
		Calculator calculator= new Calculator();
		calculator.add();
		calculator.substract();
		calculator.multiply();
		calculator.devide();		
	}
}