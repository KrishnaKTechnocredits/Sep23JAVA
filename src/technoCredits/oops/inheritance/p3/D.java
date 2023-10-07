package technoCredits.oops.inheritance.p3;

import technoCredits.oops.inheritance.p2.C;

public class D extends C{

	void processData() {
		System.out.println(x);
		m1();
		
		D c = new D();
		System.out.println(c.x);
		c.m1();
	}
}
