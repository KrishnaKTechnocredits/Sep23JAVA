
package rabish;

class Calculator1 {
	int total;

	void add(int num1, int num2) {
		int ans = num1 + num2;
		total = total + ans;
		System.out.println("Addition Result : " + ans);

	}

	void subtract(int num1, int num2) {
		int sub = num1 - num2;
		total = total + sub;
		System.out.println("Subtraction Result :" + sub);
	}

	void multiply(int num1, int num2) {
		int mult = num1 * num2;
		total = total + mult;
		System.out.println("Multiplication Result :" + mult);
	}

	void division(int num1, int num2) {
		int div = num1 / num2;
		total = total + div;
		System.out.println("Division Result :" + div);
	}

	void display() {
		System.out.println(total);
	}

	public static void main(String[] args) {
		Calculator1 c = new Calculator1();
		c.add(50, 10);
		c.subtract(50, 10);
		c.multiply(50, 10);
		c.division(50, 10);
		c.display();
	}
}