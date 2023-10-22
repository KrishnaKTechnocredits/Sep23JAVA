package pavan;

public class Assignment37 {
	int x = 10;
	int y = 20;

	void m1() {
		System.out.println(x + y);

	}

	void m2() {

		System.out.println("m2");
	}

	public static void main(String[] args) {

	}
}

class Assignment37Child extends Assignment37 {

	void m3() {
		System.out.println("m3");
		System.out.println("This is the parent class variable addition " + x + y);
	}

	public static void main(String[] args) {
		Assignment37Child obj = new Assignment37Child();
		obj.m3();
	}

}
