package sayali.oopsinheritance;

public class Assignment37_Employee extends Assignment37_Manager {
	int y = 30;
	int z = 40;

	void m2() {
		System.out.println("Employee m2");
	}

	void m3() {
		System.out.println("Employee m3");
	}

	public static void main(String[] args) {
		// case 1 Static Polymorphism CE on line 22 and 25 as parent class cannot access
		// child
		// class methods and variable
		System.out.println("case 1: ");
		Assignment37_Manager a = new Assignment37_Manager();
		System.out.println(a.x);
		System.out.println(a.y);
		// System.out.println(a.z); CE
		a.m1();
		a.m2();
		// a.m3();CE

		// case 2 child class will use all the variables and methods which is not
		// present in child class
		System.out.println("\ncase 2: ");
		Assignment37_Employee b = new Assignment37_Employee();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		b.m1();
		b.m2();
		b.m3();

		// case 3 Dynamic Polymorphism -> compiler compiles by looking at parent class
		// but
		// JVM does execution looking at child class
		System.out.println("\ncase 3: ");
		Assignment37_Manager a1 = new Assignment37_Employee();
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); CE
		a1.m1();
		a1.m2();
		// a1.m3(); CE

		// case 4 is not possible we cannot create parent object with child reference.
//		System.out.println("\ncase 4: ");
//	    Assignment37_Employee b1 = new Assignment37_Manager();
//		System.out.println(b1.x);
//		System.out.println(b1.y);
//		System.out.println(b1.z);
//		b1.m1();
//		b1.m2();
//		b1.m3();

		// case 5 This is same as case 3
		System.out.println("\ncase 5: ");
		Assignment37_Manager a2 = new Assignment37_Manager();
		Assignment37_Employee b2 = new Assignment37_Employee();
		a2 = b2;
		System.out.println(a2.x);
		System.out.println(a2.y);
		// System.out.println(a2.z);
		a2.m1();
		a2.m2();
		// a2.m3(); behavior cannot be changed

		/*
		 * case 6 compiler will allow with type cast but JVM will throw error as
		 * ClassCastException System.out.println("\ncase 6: "); Assignment37_Manager a3 =
		 * new Assignment37_Manager(); Assignment37_Employee b3 = new
		 * Assignment37_Employee(); // Exception in thread "main" (Parent class cannot
		 * be cast to child class). b3 = (Assignment37_Employee) a3;
		 * System.out.println(b3.x); System.out.println(b3.y); System.out.println(b3.z);
		 * b3.m1(); b3.m2(); b3.m3();
		 */
	}
}