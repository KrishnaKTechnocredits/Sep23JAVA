package sayali;

class Fuel{
	int balance = 0;
	
	void fillFuel(int topup){
		int topup1 = 0;
		System.out.println("Sir, fuel is added worth rs " + topup1);
	}
	
	void add(int num1, int num2, int num3){
		num1 = num2 + num3;
	}
	
	void credit(int amt){
		balance = balance + amt;
	}
	
	void debit(int amt){
		balance = balance - amt;
	}
	
	void display(){
		System.out.println(balance);
		
	}
	
	public static void main(String[] args){
		Fuel fuel = new Fuel();
		fuel.fillFuel(350);
		fuel.fillFuel(850);
		fuel.fillFuel(3500);
	}
}