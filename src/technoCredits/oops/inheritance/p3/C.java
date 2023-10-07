package technoCredits.oops.inheritance.p3;

class C extends B {
	int x = 100;
	void display() {
		System.out.println("Credits");
	}

	public static void main(String[] args) {
		B b = new C();
		b.display(10); // Techno -> 20
		b.display(); // Credits
		System.out.println(b.x);
	}
}