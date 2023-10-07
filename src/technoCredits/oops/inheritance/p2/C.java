package technoCredits.oops.inheritance.p2;

import technoCredits.oops.inheritance.p1.A;

public class C extends A{

	
	void display() {
		System.out.println(x);
		m1();
	}
	
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.x);
		c.m1();
	}
}
