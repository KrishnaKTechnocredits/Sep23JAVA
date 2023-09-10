package roshani;

class Fuel{
	int balance = 0;
	
	void fillFuel(int topupup){
		System.out.println("Sir, Fuel is added worth Rs. "+ topupup);
	}
	
	void add(int num1, int num2,int num3){
		
	}
	
	void credit(int amt){
		balance=balance+amt;
	}
	
	void debit(int amt){
		balance = balance - amt;
	}
	
	void display(){
		System.out.println(balance);  //4000
	}
	
	public static void main(String[] args){
		Fuel fuel = new Fuel();
		fuel.fillFuel(200);
		fuel.fillFuel(850);
		fuel.fillFuel(3500);
	}
}
