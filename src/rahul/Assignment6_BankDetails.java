package rahul;

class Assignment6_BankDetails {
	int currentBalanace = 1000;
	
	void debitAmt (int amt) {
		if (amt <= currentBalanace && amt > 0) {
			System.out.println("Amount getting debited ....");
			currentBalanace = currentBalanace - amt;
			System.out.println("Current balance is: " + currentBalanace);
		} 
		else if (amt < 0){
			System.out.println(amt + " is invalid amount");
		}
		else {
			System.out.println("Insufficient balance to debit");
		}
	}
	
	void creditAmt (int amt) {
		if (amt > 5000) {
			System.out.println("You can't deposite more than 5000 rs in one go");
		}
		else {
			System.out.println("Amount is getting credited ....");
			currentBalanace = currentBalanace + amt;
			System.out.println("Current balance is: " + currentBalanace);
		}
	}
	
	public static void main (String args[]) {
		Assignment6_BankDetails assignment6_bankDetails = new Assignment6_BankDetails();
		assignment6_bankDetails.debitAmt(400);
		assignment6_bankDetails.debitAmt(-200);
		assignment6_bankDetails.debitAmt(10000);
		assignment6_bankDetails.creditAmt(4000);
		assignment6_bankDetails.creditAmt(6000);
	}
}