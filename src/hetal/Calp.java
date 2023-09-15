package hetal;

class Calp{
	void add(int num1,int num2){
		System.out.println("num1 + num2 = " + (num1 + num2));
	}
	void mul(int num1,int num2){
		int total = num1 * num2;
		System.out.println("num1 * num2 = " + (num1 * num2));
	}
	void sub(int num1,int num2){
		int total = num1 - num2;
		System.out.println("num1 - num2 = " + (num1 - num2));
	}
	void div(int num1,int num2){
		int total = num1 / num2;
		System.out.println("num1 / num2 = " + (num1 / num2));
	}
	public static void main(String[] args){
         Calp calp = new Calp();
		 calp.add(5,5);
		 calp.mul(5,5);
		 calp.sub(5,5);
		 calp.div(5,5);
		 
		}
}