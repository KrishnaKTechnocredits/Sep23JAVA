class Fuel{

	int topup=500;
	int balance;
	int totalTopup;
	void fillFuel(int topup){ //parameter hold the value
	System.out.println("Sir, fuel is added worth rs" + topup);
	totalTopup=totalTopup + topup;
	}
	void add(int num1,int num2,int num3){
		
	}
	void credit(int amt){
		balance=balance + amt;
	}
	
	
	void debit(int amt){
		balance=balance - amt;
	}
	
	void display(){
		System.out.println("So far , you filled" + totalTopup);
		//System.out.println(balance);
	}
	public static void main(String[] args){
	Fuel fuel= new Fuel();
	fuel.fillFuel(350);
	fuel.fillFuel(850);
	fuel.fillFuel(3500);
	
	fuel.add(20,40);
	}
}