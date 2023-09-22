package technoCredits.interview;

public class A {
	int x = 10;
	
	void m1() {
		B.c1.m3("Techno");
		System.out.println("Techno");
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
	}
}

// System is a predefined class.
//out is a static reference variable of PrintStream class.
// println is a non static method of PrintStream class

// out is not a method, out is not a normal variable.
// out must be static reference variable and declared in class System
// m3() must be non static method and must be in the class of c1 referece variable