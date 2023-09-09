package rahul;

class Assignment5_BankDetails {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debit (int amt) {
		balance = balance - amt;
		debitCount++;
	}
	
	void credit (int amt) {
		balance = balance + amt;
		creditCount++;
	}
	
	void printStatement() {
		printStatementCount++;
	}
	
	void printCountInfo() {
		System.out.println("Remaining balance: " + balance);
		System.out.println(debitCount + " times Debit operation performed");
		System.out.println(creditCount + " times Credit operation performed");
		System.out.println(printStatementCount + " times PrintStatement operation performed");
	}
	
	public static void main (String args[]) {
		Assignment5_BankDetails assignment5_bankDetails = new Assignment5_BankDetails();
		assignment5_bankDetails.debit(100);
		assignment5_bankDetails.debit(300);
		assignment5_bankDetails.printStatement();
		assignment5_bankDetails.debit(100);
		assignment5_bankDetails.credit(600);
		assignment5_bankDetails.printStatement();
		assignment5_bankDetails.credit(400);
		assignment5_bankDetails.printCountInfo();
	}
}