package technoCredits;

class Fuel{
	int totalTopUp;
	
	void fillFuel(int topup){
		System.out.println("Sir, fuel is added worth rs " + topup);
		totalTopUp = totalTopUp + topup;
	}
	
//	void display(){
//		System.out.println("So far, you have added fuel worth rs -> " + totalTopUp)
//	}
	
	public static void main(String[] args){
		Fuel fuel = new Fuel();
		fuel.fillFuel(200);
		fuel.fillFuel(850);
		fuel.fillFuel(3500);	
	}
}