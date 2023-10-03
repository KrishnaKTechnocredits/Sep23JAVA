package akshay;

class bankDetails1 {
	int balance = 1000;

	void method1(int amount) {
		if (amount > 5000) {
			System.out.println("cant deposite more than 5000");
		} else if (amount < 0) {
			System.out.println("Invalid");

		} else {
			System.out.println(amount);
			balance = balance + amount;
		}

	}

	void method2() {
		System.out.println(balance);
	}

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		bankDetails1 bank = new bankDetails1();
		bank.method1(6000);
		bank.method1(3000);
		bank.method1(-6000);
		bank.method2();
	}
}