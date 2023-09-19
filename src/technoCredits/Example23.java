package technoCredits;

public class Example23 {
	
	static void m1() {
		System.out.println("m1");
	}
	
	void display() {
		System.out.println("diplay");
	}
	
	public static void main(String[] args) {
		System.out.println("Techno");
		Example23 e23 = new Example23();
		e23.display();
		Example23.m1();
	}
}
