package technoCredits.oops.polymorphism;

class Test {

	public static void main(String[] args) {
		short s = 10;
		Test test = new Test();
		test.m1(10.20f);
	}

	void m1(byte b) {
		System.out.println(1);
	}

	void m1(short s) {
		System.out.println(2);
	}

	void m1(int s) {
		System.out.println(3);
	}

	void m1(long s) {
		System.out.println(4);
	}

	void m1(float s) {
		System.out.println(5);
	}

	void m1(double s) {
		System.out.println(6);
	}

	void m1(String s) {
		System.out.println(7);
	}

	void m1(Object s) {
		System.out.println(8);
		
	}

}
