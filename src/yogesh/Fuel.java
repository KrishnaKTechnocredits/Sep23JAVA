package yogesh;
class Fuel{
	int tot;
	int tank=1000;
	
	void addFuel(int a){
		System.out.println("Add fuel of rs "+a);
		tot=tot+a;
	}
	
	void emptyTank(int b){
		if(tank==0)
		{
		System.out.println("Empty tank");
		}
		else{
			tank=tank-b;
		}
	}
	
	void display(){
		System.out.println("Total fuel added is "+tot);
		System.out.println("Fuel in Tank is "+tank);
	}
	
	public static void main(String[] args){
		Fuel fuel=new Fuel();
		fuel.addFuel(100);
		fuel.addFuel(500);
		fuel.addFuel(1000);
		fuel.emptyTank(500);
		fuel.emptyTank(500);
		fuel.display();
	}
}