package technoCredits.oops.inheritance.p3;

class B extends A {
	int y = 15;
	int x = 15;
	
	void display() {
		System.out.println("y ->" + y);
	}

	void m1() {
		y++;
		System.out.println(y);
	}
}