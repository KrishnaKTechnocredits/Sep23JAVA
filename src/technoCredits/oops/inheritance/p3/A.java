package technoCredits.oops.inheritance.p3;

class A {
	private int x = 10;
	private String name = "Techno";

	void display(int num) {
		num = num + x;
		System.out.println(name + "->" + num);
	}

	void display() {
		System.out.println(name);
	}
}