package swati;

public class Ass37InheritanceDemoEmployeeClass extends Ass37InheritanceDemoManagerClass {

	int y = 30;
	int z = 40;

	void m2() {
		System.out.println("Employee class m2");
	}

	void m3() {
		System.out.println("Employee class m3");
	}

	public static void main(String[] args) {
		// case 1 Static polymorphism CE on line 22 and 25 bcz parent class cannot access child 
		//class methods and variable
		System.out.println("case 1");
		Ass37InheritanceDemoManagerClass a = new Ass37InheritanceDemoManagerClass();
		System.out.println(a.x);
		System.out.println(a.y);
		// System.out.println(a.z); CE
		a.m1();
		a.m2();
		// a.m3();CE

		// case 2 child class will use all the variables and methods which is not present in child class
		System.out.println("case 2");
		Ass37InheritanceDemoEmployeeClass b = new Ass37InheritanceDemoEmployeeClass();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		b.m1();
		b.m2();
		b.m3();

		// case 3 dynamic polymorphism -> compiler compiles looking at parent class but JVM does execution looking at child class
		System.out.println("case 3");
		Ass37InheritanceDemoManagerClass a1 = new Ass37InheritanceDemoEmployeeClass();
		System.out.println(a1.x);
		System.out.println(a1.y);
		// System.out.println(a1.z); CE
		a1.m1();
		a1.m2();
		// a1.m3(); CE

		// case 4 is not possible we cannot create parent object with child reference.
//		System.out.println("case 4");
//	    Ass37InheritanceDemoEmployeeClass b1 = new Ass37InheritanceDemoManagerClass();
//		System.out.println(b1.x);
//		System.out.println(b1.y);
//		System.out.println(b1.z);
//		b1.m1();
//		b1.m2();
//		b1.m3();

		// case 5 This is same as case 3
		System.out.println("case 5");
		Ass37InheritanceDemoManagerClass a2 = new Ass37InheritanceDemoManagerClass();
		Ass37InheritanceDemoEmployeeClass b2 = new Ass37InheritanceDemoEmployeeClass();
		a2 = b2;
		System.out.println(a2.x);
		System.out.println(a2.y);
		// System.out.println(a2.z);
		a2.m1();
		a2.m2();
		// a2.m3();

		// case 6 compiler will allow with type cast but JVM will through error as ClassCastException
		System.out.println("case 6");
		Ass37InheritanceDemoManagerClass a3 = new Ass37InheritanceDemoManagerClass();
		Ass37InheritanceDemoEmployeeClass b3 = new Ass37InheritanceDemoEmployeeClass();
		b3 = (Ass37InheritanceDemoEmployeeClass) a3;
		System.out.println(b3.x);
		System.out.println(b3.y);
		System.out.println(b3.z);
		b3.m1();
		b3.m2();
		b3.m3();
	}
}
