package technoCredits.constructor;

public class B extends A{
	
	B(){
		super(3);
		System.out.println("3"); //5
	}
	
	B(int x){
		super(x);
		System.out.println("4");
	}
	
	void m1() {
		System.out.println("B m1");
	}
	
	boolean m2() { 
		System.out.println("B m2"); // 9
		return true; //10
	}

	public static void main(String[] args) {
		B b = new B(10); // 1 //6
		b.m1(10); // 7
		boolean flag = b.m2(); // 8 //11
		
		A a = new B();
	} //12
	
}
