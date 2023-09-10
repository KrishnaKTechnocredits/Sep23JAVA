package yogesh;
class Calce{
	int ans;
	void add(int a,int b){
		ans=a+b;
		System.out.println("Summation is " +ans);
	}
	
	void substraction(int a,int b){
		ans=a-b;
		System.out.println("Substraction  is "+ans);
	}
	
	void multiplication(int a,int b){
		ans=a*b;
		System.out.println("Multiplication  is " +ans);
	}
	
	void division(int a,int b){
		ans=a/b;
		System.out.println("Division is " +ans);
	}
	public static void main(String[] args){
		Calce calculator=new Calce();
		calculator.add(5,10);
		calculator.substraction(10,5);
		calculator.multiplication(10,5);
		calculator.division(10,5);
	}
}