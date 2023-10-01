package hetal;

public class Case6 {
	
	public static void main(String[] args) {
		A a = new B();
		B b = new B();
		b = (B)a;
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z);
		b.m1();
		b.m2();
		b.m3();
	}
}
