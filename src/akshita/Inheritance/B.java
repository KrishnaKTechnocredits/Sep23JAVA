package akshita.Inheritance;

public class B extends A {

	int x=15;
	int y=20;
	
	public void m1() {
		System.out.println("X+Y : "+ (x+y));
	}
	
	void m2() {
		System.out.println("Child class");
	}
	
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		b=(B)a;
		
		a.m1();
		b.m1();
		b.m2();
		System.out.println(a.x);
		System.out.println(b.x);
		System.out.println(b.y);
	}

}
