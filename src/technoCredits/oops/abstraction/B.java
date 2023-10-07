package technoCredits.oops.abstraction;

public class B implements A,Manager{
	private int num = 10;
	
	
	@Override
	final public void m1() {
		System.out.println("B m1");
	}
	
	@Override
	public void m2() {
		System.out.println("B m2" + B.x);
		m3();
	}
	
	void m3() {
		
	}

	@Override
	public void display() {
		
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int x) {
		// TODO Auto-generated method stub
		
	}
}
