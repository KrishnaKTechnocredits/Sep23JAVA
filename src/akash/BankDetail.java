package akash;

class BankDetail{
	int balance = 1000;
	int debitCount;
	int creditCount;
	int printStatementCount;
	
	void debitAmt(int amt){
		balance = balance - amt;
		debitCount = debitCount + 1;
	}
	
	void creditAmt(int amt){
		balance = balance + amt;
		creditCount = creditCount + 1;
	}

	void printStatement(){
		printStatementCount = printStatementCount + 1;
	}
	
	void printCount(){
		System.out.println("The remaining balance is : " +balance);
		System.out.println(debitCount+ " Times the debit operation is performed");
		System.out.println(creditCount+ " Times the credit operation is performed");
		System.out.println(printStatementCount+ " Times the printStatement operation performed");
	}
	
	public static void main(String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmt(500);
		bankdetail.creditAmt(2000);
		bankdetail.printStatement();
		bankdetail.creditAmt(200);
		bankdetail.debitAmt(1000);
		bankdetail.printStatement();
		bankdetail.printCount();
	}
}