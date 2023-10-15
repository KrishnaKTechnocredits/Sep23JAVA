package technoCredits.constructor.p2;

class A {

	{
		System.out.println(1); // 4
		System.out.println(2); // 5
	}

	A() {
		super(); // 3
		System.out.println("Hi"); // 6
	}

	A(int x) {
		this(); // 2
		System.out.println("Hello"); // 7
		System.out.println("techno"); // 8
	}

	A(String name, boolean status) {
		System.out.println("Credits");
		System.out.println("pune");
		System.out.println("good");
	}

	public static void main(String[] args) {
		A a = new A(10); /// 1 //9
	}

}