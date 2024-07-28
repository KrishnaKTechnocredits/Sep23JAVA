package vijay;

class Fuel1{
	int totalTopup;

	void fillFuel(int topup){
		System.out.println("Sir, fuel added worth rs" + topup);
		totalTopup = totalTopup + topup;
	}
	
	void display(){
		System.out.println("so far, you have added fuel worth rs " + totalTopup);
	}
	
	public static void main(String[] args){
		Fuel1 fuel1 = new Fuel1();
		fuel1.fillFuel(200);
		fuel1.fillFuel(850);
		fuel1.fillFuel(3500);
		fuel1.display();
	}
}