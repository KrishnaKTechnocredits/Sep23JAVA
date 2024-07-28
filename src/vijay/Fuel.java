package vijay;

class Fuel{

	void fillFuel(int topup){
		System.out.println("Sir, fuel added worth rs" + topup);
	}
	
	public static void main(String[] args){
		Fuel fuel = new Fuel();
		fuel.fillFuel(200);
		fuel.fillFuel(850);
		fuel.fillFuel(3500);
	}
}