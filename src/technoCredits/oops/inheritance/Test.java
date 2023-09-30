package technoCredits.oops.inheritance;

public class Test {
	
	void m1(int data) {
		
	}
	
	void m1(String data) {
		
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		b =(B)a;
		
		b.m2();
		
		int x = 10;
		byte b1 = (byte)x;
		long l = 1000;
		System.out.println(3);
	}
}
