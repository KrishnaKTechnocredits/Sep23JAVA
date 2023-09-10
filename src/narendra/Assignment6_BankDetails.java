package narendra;

class Assignment6_BankDetails {
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;

	void debitAmt(int amt) {
		if (amt > balance) {
			System.out.println("Insufficient balance");
		} else if (amt <= 0) {
			System.out.println("Invalid entered debit amount");
		} else {
			balance = balance - amt;
			System.out.println("Available balance is " + balance);
		}
	}

	void creditAmt(int amt) {
		if (amt > 5000) {
			System.out.println("You can't deposit amount more than 5k in one go");
		} else if (amt <= 0) {
			System.out.println("Invalid entered credit amount");
		} else {
			balance = balance + amt;
			System.out.println("Available balance is " + balance);
		}
	}

	public static void main(String[] args) {
		Assignment6_BankDetails bankdetails = new Assignment6_BankDetails();
		bankdetails.debitAmt(100);
		bankdetails.debitAmt(-100);
		bankdetails.debitAmt(1100);
		bankdetails.creditAmt(5500);
		bankdetails.creditAmt(-100);
		bankdetails.creditAmt(4900);
	}
}