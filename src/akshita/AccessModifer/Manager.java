package akshita.AccessModifer;

public class Manager {

	private int x=10;
	int y=20;
	
	void display() {
		System.out.println(" X : " + x);
		System.out.println("Y : " + y);
	}
	
	 void update() {
		x =15;
		y=25;
	}
	
	void processData() {
		System.out.println("X + Y : "+ (x+y));
	}
	
	
	
	public static void main(String[] args) {
		Employee em = new Employee();
		
		em.Pdata();

	}

}
