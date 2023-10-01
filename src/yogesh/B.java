package yogesh;

public class B extends Yogesh_Assignment37 {
	int y = 30;
	int z = 40;

	void m2() {
		System.out.println("B m2");
	}

	void m3() {
		System.out.println("B m3");
	}

	public static void main(String[] args) {

		// case 1 : (Static polymorphism)
		// A a = new A();
		Yogesh_Assignment37 a = new Yogesh_Assignment37();
		System.out.println("case 1 output:");
		System.out.println(a.x); // 10
		System.out.println(a.y); // 20
		// System.out.println(a.z);(CE z is not accessible to class
		// Yogesh_Assignment37(parent))
		a.m1(); // A m1
		a.m2(); // Am2
		// a.m3();(compilation error bcoz m3() is not accessable to Yogesh_Assignment37)
		System.out.println("=================================================");

		// case 2 :(Static polymorphism)
		B b = new B();
		System.out.println("case 2 output:");
		System.out.println(b.x); // 10
		System.out.println(b.y); // 30(bcoz variables(properties) do change from compile time to run time)
		System.out.println(b.z); // 40
		b.m1(); // am1(bcoz methods(behaviour) do change from compile time to run time)
		b.m2(); // bm2
		b.m3(); // bm3
		System.out.println("=================================================");

		// case 3 :(Dynamic polymorphism)
		Yogesh_Assignment37 c = new B();
		System.out.println("case 3 output:");
		System.out.println(c.x);
		System.out.println(c.y);
		// System.out.println(c.z);(comp error bcoz variable cant acccess)
		c.m1();
		c.m2(); // (B m2 bcoz method B is having the method m2 and we are assigning it to
				// Yogesh_assignment37 )
		// c.m3();(compilation error behaviour methos can only access if it changes)
		System.out.println("=================================================");

//case 4 :
//B d= new A(); // CE bcoz parent class cannot be assigned to child class.
		System.out.println("case 4 output:");
//		System.out.println(d.x);
//		System.out.println(d.y); 
//		System.out.println(d.z);
//		d.m1(); 
//		d.m2();
//		d.m3();
		System.out.println("=================================================");

		// case 5 :
		Yogesh_Assignment37 e = new Yogesh_Assignment37();
		B f = new B();
		e = f;
		System.out.println("case 5 output:");
		System.out.println(e.x);
		System.out.println(e.y);
		// System.out.println(e.z);same as case 3 properties cannot be acccessed
		e.m1();
		e.m2();
		// e.m3();same as case 3 behaviour cant be changed
		System.out.println("=================================================");

		// case 6 :
		Yogesh_Assignment37 g = new B();
		B h = new B();
		h = (B) g;
		System.out.println("case 6 output:");
		System.out.println(h.x);
		System.out.println(h.y);
		System.out.println(h.z);
		h.m1();
		h.m2();
		h.m3();

	}

}
