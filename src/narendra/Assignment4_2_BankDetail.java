package narendra;

class BankDetail {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;

	void debitAmt(int amt) {
		balance = balance - amt;
		debitCount++;
	}

	void creditAmt(int amt) {
		balance = balance + amt;
		creditCount++;
	}

	void printStatement() {
//		System.out.println("Current Balance is " + balance);
		printStatementCount++;
	}

	void printCountInfo() {
		System.out.println("Remaining balance is " + balance);
		System.out.println(debitCount + " times debit operation performed");
		System.out.println(creditCount + " times credit operation performed");
		System.out.println(printStatementCount + " times print statement operation performed");
	}

	public static void main(String[] args) {
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmt(100);
		bankdetail.debitAmt(300);
		bankdetail.printStatement();
		bankdetail.debitAmt(100);
		bankdetail.creditAmt(600);
		bankdetail.printStatement();
		bankdetail.creditAmt(400);
		bankdetail.printCountInfo();
	}
}