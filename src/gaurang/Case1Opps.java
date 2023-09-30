package gaurang;

public class Case1Opps {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z);  (z is not accesible to class A)
		a.m1();
		a.m2();
		//a.m3();   (m3 is not accesible to class A)
	}
}
