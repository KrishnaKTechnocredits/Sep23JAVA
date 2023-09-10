package narendra;

class BankOperations {
	int balance = 1000;

	void debit(int amt) {
		balance = balance - amt;
	}

	void credit(int amt) {
		balance = balance + amt;
	}

	void printBalance() {
		System.out.println("Total balance is " + balance);
	}

	public static void main(String[] args) {
		BankOperations bankoperations = new BankOperations();
		bankoperations.debit(200);
		bankoperations.credit(500);
		bankoperations.credit(200);
		bankoperations.debit(700);
		bankoperations.printBalance();
	}
}
