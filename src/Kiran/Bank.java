package Kiran;

class Bank {
	int total = 1000;

	void debit(int amt) {
		total = total - amt;
	}

	void credit(int amt) {
		total = total + amt;
	}

	void display() {
		System.out.println("The Total bank balance is = " + total);
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.debit(200);
		bank.credit(700);
		bank.display();
	}

}